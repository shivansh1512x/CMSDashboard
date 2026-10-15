package com.medicare.clinic.controller;

import com.medicare.clinic.entity.Message;
import com.medicare.clinic.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<Message> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Message create(@RequestBody Message item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Message update(@PathVariable Long id, @RequestBody Message item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/patient/{patientId}")
    public List<Message> byPatient(@PathVariable Long patientId) {
        return service.byPatient(patientId);
    }

}
