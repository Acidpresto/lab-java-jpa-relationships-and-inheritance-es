package com.ironhack.lab7;

import com.ironhack.lab7.model.Tasks.BillableTask;
import com.ironhack.lab7.model.Tasks.InternalTask;
import com.ironhack.lab7.repository.BillableTaskRepository;
import com.ironhack.lab7.repository.InternalTaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class TaskDataInitializer implements CommandLineRunner {

    private final BillableTaskRepository billableRepo;
    private final InternalTaskRepository internalRepo;


    public TaskDataInitializer(BillableTaskRepository billableRepo, InternalTaskRepository internalRepo) {
        this.billableRepo = billableRepo;
        this.internalRepo = internalRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        billableRepo.save(new BillableTask("Client Design Review", LocalDate.now().plusDays(5), false, new BigDecimal("80")));
        billableRepo.save(new BillableTask("Data Analysis", LocalDate.now().plusDays(10), true, new BigDecimal("100")));
        billableRepo.save(new BillableTask("Consulting Call", LocalDate.now().plusDays(2), false, new BigDecimal("120")));

        // Internal tasks
        internalRepo.save(new InternalTask("Team Meeting", LocalDate.now().plusDays(1), false));
        internalRepo.save(new InternalTask("Documentation", LocalDate.now().plusWeeks(1), true));
        internalRepo.save(new InternalTask("Code Refactoring", LocalDate.now().plusDays(3), false));

        System.out.println("✅ Sample tasks initialized.");

    }

}
