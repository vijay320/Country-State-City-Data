package com.spring.boot.location.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.location.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String name);
}
