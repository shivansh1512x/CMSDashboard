package com.medicare.clinic.controller;

import com.medicare.clinic.entity.Bill;
import com.medicare.clinic.service.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/billing")
@CrossOrigin(origins = "*")
public class BillController {

    private final BillService service;

    public BillController(BillService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bill> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Bill getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Bill create(@RequestBody Bill item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Bill update(@PathVariable Long id, @RequestBody Bill item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
