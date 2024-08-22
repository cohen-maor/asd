package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hello {

    @Id
    @GeneratedValue
    private Integer helloId;

    private String message;
}
