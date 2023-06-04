package com.bhattaditya.issuetracker.service.impl;

import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.IssueReport;
import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import com.bhattaditya.issuetracker.repository.IssueRepository;
import com.bhattaditya.issuetracker.service.AssigneeService;
import com.bhattaditya.issuetracker.service.IssueService;
import com.bhattaditya.issuetracker.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private Validator validator;

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private AssigneeService assigneeService;

    @Override
    public String reportAnIssue(Issue issue) throws IssueTrackerException {
        return null;
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
