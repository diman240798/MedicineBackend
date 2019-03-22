package io.nanicky.medicine.symptom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomService {
    @Autowired
    @Qualifier("symptomRepository")
    private SymptomRepository repository;

    public List<Symptom> getAllIllnesses() {
        return repository.findAll();
    }

    public void saveIllness(Symptom symptom) {
        repository.save(symptom);
    }
}
