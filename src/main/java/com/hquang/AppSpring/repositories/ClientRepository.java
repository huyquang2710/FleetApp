package com.hquang.AppSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquang.AppSpring.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
