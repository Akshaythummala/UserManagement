package com.example.user_details_service.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String ssn;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> skills;

    @ElementCollection
    private List<Certification> certifications;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<EmploymentHistory> employmentHistory;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<EducationalHistory> educationalHistory;
}
