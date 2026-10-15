package com.medicare.clinic.repository;

import com.medicare.clinic.entity.ClinicProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicProfileRepository extends JpaRepository<ClinicProfile, Long> {}
