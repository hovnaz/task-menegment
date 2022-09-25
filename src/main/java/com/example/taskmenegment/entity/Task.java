package com.example.taskmenegment.entity;

import com.example.taskmenegment.model.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String title;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;

    @ManyToOne()
    private User assign_user_id;


}
