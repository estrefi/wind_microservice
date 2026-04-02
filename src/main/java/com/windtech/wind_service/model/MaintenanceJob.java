package com.windtech.wind_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaintenanceJob {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;   // e.g. "Blade inspection"
    private LocalDate scheduledDate;

    @Enumerated(EnumType.STRING)
    private JobStatus jobStatus;  // SCHEDULED, IN_PROGRESS, COMPLETED

    @ManyToOne
    @JoinColumn(name = "turbine_id")
    private Turbine turbine;
}