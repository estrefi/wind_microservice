package com.windtech.wind_service.repository;

import com.windtech.wind_service.model.MaintenanceJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceJobRepository extends JpaRepository<MaintenanceJob, Long> {

}
