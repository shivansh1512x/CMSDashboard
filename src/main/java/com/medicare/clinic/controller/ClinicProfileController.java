package com.medicare.clinic.controller;

import com.medicare.clinic.entity.ClinicProfile;
import com.medicare.clinic.service.ClinicProfileService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "*")
public class ClinicProfileController {
    private final ClinicProfileService service;
    public ClinicProfileController(ClinicProfileService service) { this.service = service; }

    @GetMapping
    public ClinicProfile get() { return service.get(); }

    @PutMapping
    public ClinicProfile update(@Valid @RequestBody ClinicProfile profile) { return service.save(profile); }
}
