package com.bhattaditya.issuetracker.service;

import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.IssueReport;
import com.bhattaditya.issuetracker.entity.IssueStatus;
import com.bhattaditya.issuetracker.exception.IssueTrackerException;

import java.util.List;
import java.util.Map;

public interface IssueService {
    /**
     * @params
     *         issue - The new issue to be reported
     *
     * @operation Reports a new issue by
     *            * validating its details
     *            * fetch an assignee
     *            * persists the issue in the issueList
     *
     * @returns
     *          String - The issue id
     */
    String reportAnIssue(Issue issue) throws IssueTrackerException;

    /**
     * @params
     *         issueId - The issue id
     *         status - The new status
     *
     * @operation Updates the status of the given issue with the given status
     *
     * @returns
     *          Boolean - Result of the status update
     */
    Boolean updateStatus(String issueId,
                                         IssueStatus status) throws IssueTrackerException;

    /**
     * @params
     *         filterCriteria - A map where its
     *         key denotes an attribute of the issue object
     *         value contains the filter value
     *
     * @operation Generates a report of issues based on the filter criteria
     *
     * @returns
     *          List<IssueReport> - The list of filtered issue objects
     */
    List<IssueReport> showIssues(Map<Character, Object> filterCriteria) throws IssueTrackerException;

    /**
     * @operation Deletes the issue object which are resolved or closed,
     *            at least 14 days ago
     *
     * @returns
     *          List<Issue> - The list of issues which had been deleted
     */
    List<Issue> deleteIssues() throws IssueTrackerException;

}
