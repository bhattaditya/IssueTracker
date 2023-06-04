package com.bhattaditya.issuetracker.repository;

import com.bhattaditya.issuetracker.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, String> {
}
