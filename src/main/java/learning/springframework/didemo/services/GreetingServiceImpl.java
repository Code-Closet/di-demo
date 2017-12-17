package learning.springframework.didemo.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        System.out.println("Hellooooo");
        return "foo";
    }
}
