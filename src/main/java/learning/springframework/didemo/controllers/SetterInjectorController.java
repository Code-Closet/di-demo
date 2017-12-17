package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingService;

public class SetterInjectorController {

    private GreetingService service;

    public void setService(GreetingService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.sayHello();
    }
}
