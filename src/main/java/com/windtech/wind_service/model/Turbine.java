package com.windtech.wind_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turbine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String serialNumber;  // e.g. "VES-2024-001"

    private Double capacityMw;    // e.g. 15.0 MW

    @Enumerated(EnumType.STRING)
    private TurbineStatus status; // ACTIVE, OFFLINE, MAINTENANCE

    @ManyToOne
    @JoinColumn(name = "wind_farm_id")
    private WindFarm windFarm;
}