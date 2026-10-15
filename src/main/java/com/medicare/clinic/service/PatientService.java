package com.medicare.clinic.service;

import com.medicare.clinic.entity.Patient;
import com.medicare.clinic.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAll() {
        return repository.findAll();
    }

    public Patient getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
    }

    public Patient save(Patient item) {
        return repository.save(item);
    }

    public Patient update(Long id, Patient item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Patient> search(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

}
