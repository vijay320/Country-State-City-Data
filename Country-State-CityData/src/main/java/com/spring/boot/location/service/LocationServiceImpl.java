package com.spring.boot.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.location.model.City;
import com.spring.boot.location.model.Country;
import com.spring.boot.location.model.State;
import com.spring.boot.location.repo.CityRepository;
import com.spring.boot.location.repo.CountryRepository;
import com.spring.boot.location.repo.StateRepository;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    
    @Autowired
    private CountryRepository countryRepository;
    
    @Autowired
    private StateRepository stateRepository;
    
    @Autowired
    private CityRepository cityRepository;
    
    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    
    @Override
    public List<State> getStatesByCountry(String countryName) {
        Country country = countryRepository.findByName(countryName);
        if (country != null) {
            return stateRepository.findByCountryId(country.getId());
        }
        return null;
    }
    
    @Override
    public List<City> getCitiesByState(String countryName, String stateName) {
        Country country = countryRepository.findByName(countryName);
        if (country != null) {
            State state = stateRepository.findByNameAndCountryId(stateName, country.getId());
            if (state != null) {
                return cityRepository.findByStateId(state.getId());
            }
        }
        return null;
    }
}
