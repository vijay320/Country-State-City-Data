package com.spring.boot.location.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "state_id")
    @JsonIgnore
    private State state;
    
    // Constructors, getters, and setters
    public City() {}
    
    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }
    
    // Getters and setters
    
}