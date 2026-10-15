package com.medicare.clinic.service;

import com.medicare.clinic.entity.MedicalRecord;
import com.medicare.clinic.repository.MedicalRecordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalRecordService {

    private final MedicalRecordRepository repository;

    public MedicalRecordService(MedicalRecordRepository repository) {
        this.repository = repository;
    }

    public List<MedicalRecord> getAll() {
        return repository.findAll();
    }

    public MedicalRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("MedicalRecord not found with id: " + id));
    }

    public MedicalRecord save(MedicalRecord item) {
        return repository.save(item);
    }

    public MedicalRecord update(Long id, MedicalRecord item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<MedicalRecord> byPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }

}
