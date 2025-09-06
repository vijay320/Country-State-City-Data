package com.spring.boot.location.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;
    
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<City> cities = new ArrayList<>();
    
    // Constructors
    public State() {}
    
    public State(String name, Country country) {
        this.name = name;
        this.country = country;
    }
}