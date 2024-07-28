package com.example.user_details_service.Model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Certification {
    private String certificationName;
    private String providerName;
    private String date;
}
