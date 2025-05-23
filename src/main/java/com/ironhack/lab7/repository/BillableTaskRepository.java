package com.ironhack.lab7.repository;

import com.ironhack.lab7.model.Tasks.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
