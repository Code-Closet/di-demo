package learning.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Andi and Kundi style");
        return "hehe";
    }

}
