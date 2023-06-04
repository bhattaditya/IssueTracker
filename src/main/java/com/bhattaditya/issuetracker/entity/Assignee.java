package com.bhattaditya.issuetracker.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Assignee {

    @Id
    private String  id;
    private String name;
    private String email;
    private Unit workingUnit;
    private LocalDateTime employeeSince;
    private Integer numberOfActiveIssues;

    public Assignee() {
    }

    public Assignee(String id, String name, String email, Unit workingUnit, LocalDateTime employeeSince, Integer numberOfActiveIssues) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.workingUnit = workingUnit;
        this.employeeSince = employeeSince;
        this.numberOfActiveIssues = numberOfActiveIssues;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Unit getWorkingUnit() {
        return workingUnit;
    }

    public void setWorkingUnit(Unit workingUnit) {
        this.workingUnit = workingUnit;
    }

    public LocalDateTime getEmployeeSince() {
        return employeeSince;
    }

    public void setEmployeeSince(LocalDateTime employeeSince) {
        this.employeeSince = employeeSince;
    }

    public Integer getNumberOfActiveIssues() {
        return numberOfActiveIssues;
    }

    public void setNumberOfActiveIssues(Integer numberOfActiveIssues) {
        this.numberOfActiveIssues = numberOfActiveIssues;
    }

    @Override
    public String toString() {
        return "Assignee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", workingUnit=" + workingUnit +
                ", employeeSince=" + employeeSince +
                ", numberOfActiveIssues=" + numberOfActiveIssues +
                '}';
    }
}
