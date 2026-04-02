package com.windtech.wind_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WindFarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;          // e.g. "Horns Rev 3"

    private String location;      // e.g. "North Sea, Denmark"
    private Integer turbineCount;

    @OneToMany(mappedBy = "windFarm", cascade = CascadeType.ALL)
    private List<Turbine> turbines = new ArrayList<>();
}