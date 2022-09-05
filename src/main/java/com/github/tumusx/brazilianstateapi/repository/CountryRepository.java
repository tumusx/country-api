package com.github.tumusx.brazilianstateapi.repository;

import com.github.tumusx.brazilianstateapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
