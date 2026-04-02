package com.windtech.wind_service.controller;

import com.windtech.wind_service.model.Turbine;
import com.windtech.wind_service.model.TurbineStatus;
import com.windtech.wind_service.repository.TurbineRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turbines")
@RequiredArgsConstructor
public class TurbineController {
    private final TurbineRepository turbineRepository;

    @GetMapping
    public List<Turbine> getAll() {
        return turbineRepository.findAll();
    }

    @GetMapping("/{id}")
    public Turbine getById(@PathVariable Long id) {
        return turbineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Turbine not found"));
    }

    @PostMapping
    public Turbine create(@Valid @RequestBody Turbine turbine) {
        return turbineRepository.save(turbine);
    }

    @PatchMapping("/{id}/status")
    public Turbine updateStatus(@PathVariable Long id,
                                @RequestParam TurbineStatus status) {
        Turbine turbine = turbineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Turbine not found"));
        turbine.setStatus(status);
        return turbineRepository.save(turbine);
    }
}
