package com.windtech.wind_service.repository;

import com.windtech.wind_service.model.Turbine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurbineRepository extends JpaRepository<Turbine, Long> {

}