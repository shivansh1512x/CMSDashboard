package com.medicare.clinic.controller;

import com.medicare.clinic.entity.MedicalReport;
import com.medicare.clinic.service.MedicalReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "*")
public class MedicalReportController {

    private final MedicalReportService service;

    public MedicalReportController(MedicalReportService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedicalReport> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MedicalReport getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public MedicalReport create(@RequestBody MedicalReport item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public MedicalReport update(@PathVariable Long id, @RequestBody MedicalReport item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/patient/{patientId}")
    public List<MedicalReport> byPatient(@PathVariable Long patientId) {
        return service.byPatient(patientId);
    }

}
