package com.example.taskmenegment.repository;

import com.example.taskmenegment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
