package com.medicare.clinic.repository;

import com.medicare.clinic.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDate(java.time.LocalDate date);
}
