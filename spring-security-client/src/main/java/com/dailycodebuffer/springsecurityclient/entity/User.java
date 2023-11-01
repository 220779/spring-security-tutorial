package com.dailycodebuffer.springsecurityclient.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @Column (length = 60)
    private String password;
    private String role;
    private boolean enables = false;



}
