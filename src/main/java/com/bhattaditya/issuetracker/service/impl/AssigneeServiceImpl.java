package com.bhattaditya.issuetracker.service.impl;

import com.bhattaditya.issuetracker.entity.Assignee;
import com.bhattaditya.issuetracker.entity.Unit;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import com.bhattaditya.issuetracker.repository.AssigneeRepository;
import com.bhattaditya.issuetracker.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    @Autowired
    private AssigneeRepository assigneeRepository;

    @Override
    public void createAssignee(Assignee assignee) {

    }

    @Override
    public List<Assignee> fetchAssignees(Unit unit) {
        List<Assignee> assigneeList = assigneeRepository.findAll();
        return assigneeList.stream().filter(assignee -> unit.equals(assignee.getWorkingUnit())).filter(assignee -> assignee.getNumberOfActiveIssues() < 3).toList();
    }

    @Override
    public void updateActiveIssueCount(String assigneeEmail, Character operation) throws IssueTrackerException {
        Optional<Assignee> assignee = assigneeRepository.findByEmail(assigneeEmail);
        if (assignee.isEmpty()) {
            throw new IssueTrackerException("Not Assignee found with email : " + assigneeEmail);
        }
        Integer numberOfActiveIssues = assignee.get().getNumberOfActiveIssues();

        if (operation == 'I') {
            assignee.get().setNumberOfActiveIssues(numberOfActiveIssues + 1);
        } else if (operation == 'D') {
            assignee.get().setNumberOfActiveIssues(numberOfActiveIssues - 1);
        }
    }

    @Override
    public void deleteAssignee() {

    }
}
