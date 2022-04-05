package com.example.demoNas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Stream;

@RestController
public class TestController {
    static List<Patient> patients = Arrays.asList(
            new Patient("Anna", "123987"),
            new Patient("Sofia", "987123"),
            new Patient("Monika", "456654"));


    @GetMapping("/patients")
    public static String getPatient(@RequestParam String snils) {
        Patient patient = new Patient();
        for (Patient patientFromList : patients) {
            if (patientFromList.getSnils().equals(snils)) {
                patient = patientFromList;
            }
        }
        return patient.getName();
        //return patient.getName() == null ? "Пациент не найден" : patient.getName();
    }
}



