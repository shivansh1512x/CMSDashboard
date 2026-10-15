package com.medicare.clinic.service;

import com.medicare.clinic.entity.Appointment;
import com.medicare.clinic.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<Appointment> getAll() {
        return repository.findAll();
    }

    public Appointment getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
    }

    public Appointment save(Appointment item) {
        return repository.save(item);
    }

    public Appointment update(Long id, Appointment item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Appointment> today() {
        return repository.findByDate(java.time.LocalDate.now());
    }

}
