package com.bhattaditya.issuetracker.controller;

import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.entity.Unit;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import com.bhattaditya.issuetracker.repository.IssueRepository;
import com.bhattaditya.issuetracker.service.IssueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    private static final Logger LOGGER = LoggerFactory.getLogger(IssueController.class);

    @GetMapping("/test")
    public String testing() {
        LOGGER.info("Testing ...");
        return "working";
    }

    @GetMapping("/report")
    public void reportAnIssue() throws IssueTrackerException {
        LOGGER.info("Mont Trance Inc. | Reporting An Issue");

        Issue issue = new Issue("MTI-I-013-HS", "Third menu item is missing",
                Unit.CONSIGNMENT,
                LocalDateTime.now().minusDays(11), null, null,
                IssueStatus.IN_PROGRESS);

        String issueId = issueService.reportAnIssue(issue);
        System.out.println("IssueId: " + issueId);
    }
}
