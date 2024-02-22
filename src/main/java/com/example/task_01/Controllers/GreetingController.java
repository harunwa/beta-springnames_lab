package com.example.task_01.Controllers;

import com.example.task_01.Models.Celebration;
import com.example.task_01.Models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(){
        Greeting greeting = new Greeting("Colin", "Good Afternoon");
        return new Greeting("Colin", "Good afternoon");
    }

    @GetMapping("/greeting/summer")
    public Celebration summerGreeting() {
        return new Celebration("Happy Summer Solstice!");
    }



}
