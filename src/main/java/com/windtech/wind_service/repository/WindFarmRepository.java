package com.windtech.wind_service.repository;

import com.windtech.wind_service.model.WindFarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindFarmRepository extends JpaRepository<WindFarm, Long> {}