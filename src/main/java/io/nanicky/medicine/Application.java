package io.nanicky.medicine;

import io.nanicky.medicine.illness.Illness;
import io.nanicky.medicine.illness.IllnessRepository;
import io.nanicky.medicine.symptom.Symptom;
import io.nanicky.medicine.symptom.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Application implements ApplicationRunner, CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }


    @Autowired
    private IllnessRepository illnessRepository;

    @Autowired
    private SymptomRepository symptomRepository;

    @Override
    public void run(String... args) throws Exception {
        Symptom headache = new Symptom("headache", new ArrayList<>());
        symptomRepository.save(headache);
        Illness headIllnesas = new Illness("ФИГ ЕГО ЗНАЕТ ГОЛОВА БОЛИТ ПОЧЕМУ", Arrays.asList(headache));
        illnessRepository.save(headIllnesas);
    }
}
