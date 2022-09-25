package com.example.taskmenegment.repository;

import com.example.taskmenegment.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
