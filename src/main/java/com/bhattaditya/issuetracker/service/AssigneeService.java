package com.bhattaditya.issuetracker.service;

import com.bhattaditya.issuetracker.entity.Assignee;
import com.bhattaditya.issuetracker.entity.Unit;

import java.util.List;

public interface AssigneeService {

    void createAssignee(Assignee assignee);
    List<Assignee> fetchAssignees(Unit unit);
    void updateActiveIssueCount(String assigneeEmail, Character operation);

    void deleteAssignee();

}
