package com.example.user_details_service.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "educational_history")
public class EducationalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;
    private String schoolAddress;
    private String gpa;
    private String courseName;
    private String completionDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
