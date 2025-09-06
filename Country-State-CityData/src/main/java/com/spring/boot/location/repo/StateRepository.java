package com.spring.boot.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.location.model.State;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryId(Long countryId);
    State findByNameAndCountryId(String name, Long countryId);
}
