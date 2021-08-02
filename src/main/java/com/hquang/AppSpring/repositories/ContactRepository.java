package com.hquang.AppSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquang.AppSpring.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
