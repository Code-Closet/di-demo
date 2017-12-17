package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingService;

public class ConstructorInjectorController {

    private GreetingService service;

    public ConstructorInjectorController(GreetingService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.sayHello();
    }
}
