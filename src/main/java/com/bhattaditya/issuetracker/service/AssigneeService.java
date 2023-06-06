package com.bhattaditya.issuetracker.service;

import com.bhattaditya.issuetracker.entity.Assignee;
import com.bhattaditya.issuetracker.entity.Unit;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;

import java.util.List;

public interface AssigneeService {

    void createAssignee(Assignee assignee);
    List<Assignee> fetchAssignees(Unit unit);
    void updateActiveIssueCount(String assigneeEmail, Character operation) throws IssueTrackerException;

    void deleteAssignee();

}
