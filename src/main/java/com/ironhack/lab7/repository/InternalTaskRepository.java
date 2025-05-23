package com.ironhack.lab7.repository;

import com.ironhack.lab7.model.Tasks.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
