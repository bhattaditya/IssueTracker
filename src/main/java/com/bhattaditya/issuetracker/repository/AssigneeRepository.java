package com.bhattaditya.issuetracker.repository;

import com.bhattaditya.issuetracker.entity.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssigneeRepository extends JpaRepository<Assignee, String> {

    Optional<Assignee> findByEmail(String assigneeEmail);
}
