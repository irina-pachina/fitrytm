package com.fitrytm.data.service;

import com.fitrytm.data.entity.Exercise;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    private final ExerciseRepository repository;

    public ExerciseService(ExerciseRepository repository) {
        this.repository = repository;
    }

    public Optional<Exercise> get(Long id) {
        return repository.findById(id);
    }

    public Exercise update(Exercise entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Exercise> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Exercise> list(Pageable pageable, Specification<Exercise> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
