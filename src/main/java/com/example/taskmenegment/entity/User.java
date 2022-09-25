package com.example.taskmenegment.entity;

import com.example.taskmenegment.model.Role;
import lombok.*;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;
    private String surname;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private String email;

}
