package com.medicare.clinic.controller;

import com.medicare.clinic.entity.MedicalRecord;
import com.medicare.clinic.service.MedicalRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medical-records")
@CrossOrigin(origins = "*")
public class MedicalRecordController {

    private final MedicalRecordService service;

    public MedicalRecordController(MedicalRecordService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedicalRecord> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MedicalRecord getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public MedicalRecord create(@RequestBody MedicalRecord item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public MedicalRecord update(@PathVariable Long id, @RequestBody MedicalRecord item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/patient/{patientId}")
    public List<MedicalRecord> byPatient(@PathVariable Long patientId) {
        return service.byPatient(patientId);
    }

}
