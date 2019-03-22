package io.nanicky.medicine.symptom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SymptomController {

    @Autowired
    @Qualifier("symptomService")
    private SymptomService service;

    @RequestMapping("/symptoms")
    public List<Symptom> getAllIllnessess() {
        return service.getAllIllnesses();
    }

    @RequestMapping(value = "/symptoms/add", method = POST)
    public void addIllnessCourses(@RequestBody Symptom symptom) {
        service.saveIllness(symptom);
    }



}
