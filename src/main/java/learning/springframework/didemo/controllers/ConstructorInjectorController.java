package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {

    private GreetingService service;

    public ConstructorInjectorController(@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.sayHello();
    }
}
