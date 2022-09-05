package com.github.tumusx.brazilianstateapi.service;

import com.github.tumusx.brazilianstateapi.model.Country;
import com.github.tumusx.brazilianstateapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountry(){
        return countryRepository.findAll();
    }

    public void insertCountry(Country country) {
        countryRepository.save(country);
    }

    public void deleteCountryById(Long idCountry){
        try {
            countryRepository.deleteById(idCountry);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
