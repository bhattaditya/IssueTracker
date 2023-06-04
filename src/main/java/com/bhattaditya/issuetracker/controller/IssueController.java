package com.bhattaditya.issuetracker.controller;

import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;
import com.bhattaditya.issuetracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @GetMapping("/test")
    public String testing() {
        return "working";
    }
}
