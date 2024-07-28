package com.example.user_details_service.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employment_history")
public class EmploymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String companyAddress;
    private String companyPhone;
    private String supervisorName;
    private String title;
    private String principalDuties;
    private String startDate;
    private String endDate;
    private String salary;
    private String reasonForLeaving;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
