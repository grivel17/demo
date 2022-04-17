package com.example.demo;

import com.example.demo.model.Patients;
import com.example.demo.repository.PatientsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controllers {
    private PatientsRepository patientsRepository;

    public Controllers(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @GetMapping(value = "/patients2")
    ResponseEntity<List<Patients>> getAllPatients() {
        return ResponseEntity.ok(patientsRepository.findAll());
    }

    @PostMapping(value="/patients2")
    Patients addPatient(@RequestBody Patients patients) {return patientsRepository.save(patients);
    }
}