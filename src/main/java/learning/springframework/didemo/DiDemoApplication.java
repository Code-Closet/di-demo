package learning.springframework.didemo;

import learning.springframework.didemo.controllers.ConstructorInjectorController;
import learning.springframework.didemo.controllers.MyController;
import learning.springframework.didemo.controllers.PropertyInjectorController;
import learning.springframework.didemo.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectorController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectorController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectorController.class).sayHello());
	}
}
