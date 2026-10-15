package com.medicare.clinic.service;

import com.medicare.clinic.entity.Review;
import com.medicare.clinic.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository repository;

    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    public List<Review> getAll() {
        return repository.findAll();
    }

    public Review getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found with id: " + id));
    }

    public Review save(Review item) {
        return repository.save(item);
    }

    public Review update(Long id, Review item) {
        item.setId(id);
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
