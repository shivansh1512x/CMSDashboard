package com.medicare.clinic.service;

import com.medicare.clinic.entity.Bill;
import com.medicare.clinic.repository.BillRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillService {

    private final BillRepository repository;

    public BillService(BillRepository repository) {
        this.repository = repository;
    }

    public List<Bill> getAll() {
        return repository.findAll();
    }

    public Bill getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill not found with id: " + id));
    }

    public Bill save(Bill item) {
        return repository.save(item);
    }

    public Bill update(Long id, Bill item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
