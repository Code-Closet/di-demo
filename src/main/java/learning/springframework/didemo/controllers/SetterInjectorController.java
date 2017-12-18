package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController {

    private GreetingService service;

    @Autowired
    @Qualifier("setterGreetingService")
    public void setService( GreetingService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.sayHello();
    }
}
