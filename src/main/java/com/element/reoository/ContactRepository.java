package com.element.reoository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.element.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
