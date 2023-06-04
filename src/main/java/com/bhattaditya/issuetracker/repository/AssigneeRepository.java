package com.bhattaditya.issuetracker.repository;

import com.bhattaditya.issuetracker.entity.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssigneeRepository extends JpaRepository<Assignee, String> {
}
