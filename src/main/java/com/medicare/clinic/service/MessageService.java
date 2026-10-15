package com.medicare.clinic.service;

import com.medicare.clinic.entity.Message;
import com.medicare.clinic.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> getAll() {
        return repository.findAll();
    }

    public Message getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found with id: " + id));
    }

    public Message save(Message item) {
        return repository.save(item);
    }

    public Message update(Long id, Message item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Message> byPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }

}
