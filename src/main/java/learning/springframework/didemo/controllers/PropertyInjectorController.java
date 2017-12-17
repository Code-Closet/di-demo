package learning.springframework.didemo.controllers;

import learning.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectorController {

    public GreetingServiceImpl greetings;

    public String sayHello(){
        return  greetings.sayHello();
    }

}
