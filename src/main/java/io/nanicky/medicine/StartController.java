package io.nanicky.medicine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @RequestMapping("/")
    public String getAllCourses() { return "Hello World!"; }

}
