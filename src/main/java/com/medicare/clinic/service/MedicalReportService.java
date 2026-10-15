package com.medicare.clinic.service;

import com.medicare.clinic.entity.MedicalReport;
import com.medicare.clinic.repository.MedicalReportRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalReportService {

    private final MedicalReportRepository repository;

    public MedicalReportService(MedicalReportRepository repository) {
        this.repository = repository;
    }

    public List<MedicalReport> getAll() {
        return repository.findAll();
    }

    public MedicalReport getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("MedicalReport not found with id: " + id));
    }

    public MedicalReport save(MedicalReport item) {
        return repository.save(item);
    }

    public MedicalReport update(Long id, MedicalReport item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<MedicalReport> byPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }

}
