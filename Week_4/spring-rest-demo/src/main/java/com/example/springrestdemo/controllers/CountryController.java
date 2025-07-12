package com.example.springrestdemo.controllers;

import com.example.springrestdemo.models.Country;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("India", "New Delhi"));
        countryMap.put("US", new Country("United States", "Washington, D.C."));
        countryMap.put("FR", new Country("France", "Paris"));
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countryMap.get(code.toUpperCase());
        if (country == null) {
            throw new RuntimeException("Country not found for code: " + code);
        }
        return country;
    }
}
