package com.spring.boot.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.location.service.LocationService;

@RestController
@RequestMapping("/api/locations")
public class LocationController {
    
    @Autowired
    private LocationService locationService;
    
    @GetMapping
    public ResponseEntity<?> getLocations(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String state) {
        
        try {
            if (country == null && state == null) {
                // No parameters - return all countries
                return ResponseEntity.ok(locationService.getAllCountries());
            } else if (country != null && state == null) {
                // Only country provided - return states
                return ResponseEntity.ok(locationService.getStatesByCountry(country));
            } else if (country != null && state != null) {
                // Both provided - return cities
                return ResponseEntity.ok(locationService.getCitiesByState(country, state));
            } else {
                // Invalid combination (like state without country)
                return ResponseEntity.badRequest().body("Error: Country parameter is required when state is provided");
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error retrieving data: " + e.getMessage());
        }
    }
}