package com.spring.boot.location.service;

import java.util.List;

import com.spring.boot.location.model.City;
import com.spring.boot.location.model.Country;
import com.spring.boot.location.model.State;

public interface LocationService {
    List<Country> getAllCountries();
    List<State> getStatesByCountry(String countryName);
    List<City> getCitiesByState(String countryName, String stateName);
}
