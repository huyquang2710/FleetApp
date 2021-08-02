package com.hquang.AppSpring.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hquang.AppSpring.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
