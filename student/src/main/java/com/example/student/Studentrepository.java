package com.example.student;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  Studentrepository extends JpaRepository<Studentdetails, Integer>{


}
