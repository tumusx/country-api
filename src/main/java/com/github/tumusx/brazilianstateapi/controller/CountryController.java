package com.github.tumusx.brazilianstateapi.controller;

import com.github.tumusx.brazilianstateapi.model.Country;
import com.github.tumusx.brazilianstateapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @DeleteMapping("/delete/{idCountry}")
    public void deleteCountryById(@PathVariable("idCountry") Long idCountry) {
        countryService.deleteCountryById(idCountry);
    }

    @PostMapping
    public void insertCountry(@RequestBody Country country) {
        countryService.insertCountry(country);
    }

    @GetMapping
    public List<Country> getAllCountry() {
        return countryService.getAllCountry();
    }

}
