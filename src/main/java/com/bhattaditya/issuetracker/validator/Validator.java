package com.bhattaditya.issuetracker.validator;

import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class Validator {
    public void validate(Issue issue) throws IssueTrackerException {

        if (!isValidIssueId(issue.getId())) {
            throw new IssueTrackerException("Validator.INVALID_ISSUE_ID");
        }

        if (!isValidIssueDescription(issue.getDescription())) {
            throw new IssueTrackerException("Validator.INVALID_ISSUE_DESCRIPTION");
        }

        if (!isValidReportedOn(issue.getReportedOn())) {
            throw new IssueTrackerException("Validator.INVALID_REPORTED_DATE");
        }

        if (!isValidStatus(issue.getStatus())) {
            throw new IssueTrackerException("Validator.INVALID_STATUS");
        }

    }

    public Boolean isValidIssueId(String issueId) {

        if (issueId == null || issueId.isEmpty()) {
            return false;
        }

        String[] parts = issueId.split("-");
        String firstPart = parts[0] + "-" + parts[1];
        String secondPart = parts[2];
        String thirdPart = parts[3];

        if (parts.length != 4) {
            return false;
        }

        if (!firstPart.equals("MTI-I")) {
            return false;
        }

        if (secondPart.equals("000") || !secondPart.matches("[0-9]{3}")) {
            return false;
        }

        if (!(thirdPart.equals("LS") || thirdPart.equals("MS") || thirdPart.equals("HS"))) {
            return false;
        }

        // return issueId != null && issueId.matches("MTI-I-[1-9]\\d{2}-(LS|MS|HS)") && !issueId.contains("000");

        return true;
    }

    public Boolean isValidIssueDescription(String issueDescription) {
        if (issueDescription == null || issueDescription.trim().isEmpty()) {
            return false;
        }

        String pattern = "[A-Za-z]+( [A-Za-z]+)*$";

        return issueDescription.matches(pattern);
    }

    public Boolean isValidReportedOn(LocalDateTime reportedOn) {

        return reportedOn != null && !reportedOn.isAfter(LocalDateTime.now());
    }

    public Boolean isValidStatus(IssueStatus status) {

        return status != null && (status.equals(IssueStatus.OPEN) || status.equals(IssueStatus.IN_PROGRESS));
    }
}
