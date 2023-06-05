package com.bhattaditya.issuetracker.service.impl;

import com.bhattaditya.issuetracker.controller.IssueController;
import com.bhattaditya.issuetracker.entity.Assignee;
import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.IssueReport;
import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import com.bhattaditya.issuetracker.repository.IssueRepository;
import com.bhattaditya.issuetracker.service.AssigneeService;
import com.bhattaditya.issuetracker.service.IssueService;
import com.bhattaditya.issuetracker.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.stream.Collectors;

@Service
public class IssueServiceImpl implements IssueService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IssueService.class);

    @Autowired
    private Validator validator;

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private AssigneeService assigneeService;

    @Override
    public String reportAnIssue(Issue issue) throws IssueTrackerException {
        try {
            validator.validate(issue);
            //successful validation at this step
            List<Assignee> assigneeList = assigneeService.fetchAssignees(issue.getUnit());
            if (!assigneeList.isEmpty()) {
                Assignee chosenAssignee = assigneeList.get(0);
                issue.setEmail(chosenAssignee.getEmail());

                List<Issue> issues = issueRepository.findAll();
                List<String> issueList = issues.parallelStream()
                        .map(existingIssue -> existingIssue.getId().split("-")[2])
                        .toList();

                LOGGER.info("issue id: : " + issue.getId());
                LOGGER.info("issue list ids: : " + issueList);
                if (issueList.contains(issue.getId().split("-")[2])) {
                    throw new IssueTrackerException("IssueService.DUPLICATE_ISSUE_ID");
                } else {
                    assigneeService.updateActiveIssueCount(chosenAssignee.getEmail(), 'I');
                    issueRepository.save(issue);
                    return issue.getId();
                }

            } else {
                //LOGGER.log(Level.SEVERE, "No available assignee found for the issue.");
                throw new IssueTrackerException("IssueService.NO_ASSIGNEE_AVAILABLE");
            }
        } catch (IssueTrackerException e) {
            LOGGER.error("IssueTrackerException occurred: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public Boolean updateStatus(String issueId, IssueStatus status) throws IssueTrackerException {
        return null;
    }

    @Override
    public List<IssueReport> showIssues(Map<Character, Object> filterCriteria) throws IssueTrackerException {
        return null;
    }

    @Override
    public List<Issue> deleteIssues() throws IssueTrackerException {
        return null;
    }
}
