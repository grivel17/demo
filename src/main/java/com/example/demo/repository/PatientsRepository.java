package com.example.demo.repository;

import com.example.demo.model.Patients;

import java.util.List;

public interface PatientsRepository {
    List<Patients> findAll();
    Patients save(Patients entity);

}
