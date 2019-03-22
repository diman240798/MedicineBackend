package io.nanicky.medicine.illness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class IllnessController {

    @Autowired
    @Qualifier("illnessService")
    private IllnessService illnessService;

    @RequestMapping("/illnesses")
    public List<Illness> getAllIllnessess() {
        return illnessService.getAllIllnesses();
    }

    @RequestMapping(value = "/illnesses/add", method = POST)
    public void addIllnessCourses(@RequestBody Illness illness) {
        illnessService.saveIllness(illness);
    }



}
