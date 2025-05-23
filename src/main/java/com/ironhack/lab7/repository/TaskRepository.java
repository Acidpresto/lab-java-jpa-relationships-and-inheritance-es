package com.ironhack.lab7.repository;

import com.ironhack.lab7.model.Tasks.BillableTask;
import com.ironhack.lab7.model.Tasks.InternalTask;
import com.ironhack.lab7.model.Tasks.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long> {}
