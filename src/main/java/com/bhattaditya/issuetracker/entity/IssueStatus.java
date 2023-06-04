package com.bhattaditya.issuetracker.entity;

public enum IssueStatus {
    OPEN(0),
    IN_PROGRESS(1),
    CLOSED(2),
    RESOLVED(3),
    RECALLED(4);

    private final int value;

    IssueStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
