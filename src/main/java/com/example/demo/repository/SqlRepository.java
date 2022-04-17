package com.example.demo.repository;

import com.example.demo.model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlRepository extends PatientsRepository, JpaRepository<Patients, Integer> {
}
