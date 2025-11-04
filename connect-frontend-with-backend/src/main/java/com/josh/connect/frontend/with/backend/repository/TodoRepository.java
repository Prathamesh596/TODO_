package com.josh.connect.frontend.with.backend.repository;

import com.josh.connect.frontend.with.backend.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
