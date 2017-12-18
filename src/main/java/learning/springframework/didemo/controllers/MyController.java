package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String hello(){
        System.out.println("Helloooooooo");
        return service.sayHello();
    }

}
