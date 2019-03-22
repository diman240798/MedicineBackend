package io.nanicky.medicine.illness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessService {

    @Autowired
    @Qualifier("illnessRepository")
    private IllnessRepository repository;

    public List<Illness> getAllIllnesses() {
        return repository.findAll();
    }

    public void saveIllness(Illness illness) {
        repository.save(illness);
    }
}
