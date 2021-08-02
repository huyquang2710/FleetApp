package com.hquang.AppSpring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquang.AppSpring.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	
}
