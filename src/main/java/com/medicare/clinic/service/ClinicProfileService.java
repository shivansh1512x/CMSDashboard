package com.medicare.clinic.service;

import com.medicare.clinic.entity.ClinicProfile;
import com.medicare.clinic.repository.ClinicProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ClinicProfileService {
    private static final long PROFILE_ID = 1L;
    private final ClinicProfileRepository repository;

    public ClinicProfileService(ClinicProfileRepository repository) { this.repository = repository; }

    public ClinicProfile get() {
        return repository.findById(PROFILE_ID).orElseGet(() -> {
            ClinicProfile p = new ClinicProfile();
            p.setId(PROFILE_ID);
            return p;
        });
    }

    public ClinicProfile save(ClinicProfile profile) {
        profile.setId(PROFILE_ID);
        return repository.save(profile);
    }
}
