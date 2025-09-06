package com.spring.boot.location.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<State> states;
    
    // Constructors, getters, and setters
    public Country() {}
    
    public Country(String name) {
        this.name = name;
    }
    
    // Getters and setters
    
}
