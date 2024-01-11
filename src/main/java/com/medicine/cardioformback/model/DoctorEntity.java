package com.medicine.cardioformback.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "doctor")
@Data
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fio", length = 200)
    private String fio;

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "job_experience")
    private String jobExperience;

    @Column(name = "passed_years_since_graduation")
    private Integer passedYearsSinceGraduation;

    @Column(name = "weekly_echocardiogram_count")
    private Integer weeklyEchocardiogramCount;

}

