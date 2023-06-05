package com.bhattaditya.issuetracker;

import com.bhattaditya.issuetracker.entity.Assignee;
import com.bhattaditya.issuetracker.entity.Issue;
import com.bhattaditya.issuetracker.entity.Unit;
import com.bhattaditya.issuetracker.repository.AssigneeRepository;
import com.bhattaditya.issuetracker.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class IssueTrackerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IssueTrackerApplication.class, args);
    }

//    @Autowired
//    private IssueRepository issueRepository;
//    @Autowired
//    private AssigneeRepository assigneeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Assignee assigneeOne = new Assignee("MTI-A-ADM-001", "Carry Luke", "carry.luke", Unit.ADMINISTRATION,
//                LocalDateTime.now().minusWeeks(300), 3);
//
//        Assignee assigneeTwo = new Assignee("MTI-A-ADM-002", "Rodrick Luther", "rodrick_luther", Unit.ADMINISTRATION,
//                LocalDateTime.now().minusWeeks(259), 3);
//
//        Assignee assigneeThree = new Assignee("MTI-A-CSG-001", "Miki Worth", "miki.w", Unit.CONSIGNMENT,
//                LocalDateTime.now().minusWeeks(200), 1);
//
//        Assignee assigneeFour = new Assignee("MTI-A-CSG-002", "Carlena Fife", "c_fife", Unit.CONSIGNMENT,
//                LocalDateTime.now().minusWeeks(167), 0);
//
//        Assignee assigneeFive = new Assignee("MTI-A-CSG-003", "Cedrick Padgett", "c.padgett", Unit.CONSIGNMENT,
//                LocalDateTime.now().minusWeeks(243), 0);
//
//        Assignee assigneeSix = new Assignee("MTI-A-CSG-004", "Tyrell Eaves", "tyrell_e", Unit.CONSIGNMENT,
//                LocalDateTime.now().minusWeeks(300), 0);
//
//        Assignee assigneeSeven = new Assignee("MTI-A-CSG-005", "Jewel Seaton", "jewel_seaton", Unit.CONSIGNMENT,
//                LocalDateTime.now().minusWeeks(259), 0);
//
//        Assignee assigneeEight = new Assignee("MTI-A-PAY-001", "Larita Conklin", "larita.conklin", Unit.PAYMENT,
//                LocalDateTime.now().minusWeeks(200), 1);
//
//        Assignee assigneeNine = new Assignee("MTI-A-PAY-002", "Elyse Chu", "elyse.chu", Unit.PAYMENT,
//                LocalDateTime.now().minusWeeks(167), 1);
//
//        Assignee assigneeTen = new Assignee("MTI-A-SHP-001", "Elane Lester", "elane_lester", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(243), 1);
//
//        Assignee assigneeEleven = new Assignee("MTI-A-SHP-002", "Valery Champion", "valery_c", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(300), 0);
//
//        Assignee assigneeTwelve = new Assignee("MTI-A-SHP-003", "Aaron Godfrey", "aaron.g", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(259), 0);
//
//        Assignee assigneeThirteen = new Assignee("MTI-A-SHP-004", "Jarvis Ivy", "jarvis_ivy", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(200), 0);
//
//        Assignee assigneeFourteen = new Assignee("MTI-A-SHP-005", "Zackary Marble", "zackary.m", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(167), 0);
//
//        Assignee assigneeFifteen = new Assignee("MTI-A-SHP-006", "Williams Weir", "williams_weir", Unit.SHIPMENT,
//                LocalDateTime.now().minusWeeks(243), 0);
//
//        List<Assignee> assignees = List.of(assigneeOne, assigneeTwo, assigneeThree,
//                assigneeFour, assigneeFive, assigneeSix,
//                assigneeSeven, assigneeEight, assigneeNine,
//                assigneeTen, assigneeEleven, assigneeTwelve,
//                assigneeThirteen, assigneeFourteen,
//                assigneeFifteen);

//        List<Assignee> assignees = assigneeRepository.findAll();
//        System.out.println(assignees);
//
//        List<Issue> issues = issueRepository.findAll();
//        System.out.println(issues);
    }

}
