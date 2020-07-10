package haydende.springframework.sfgdi;

import haydende.springframework.sfgdi.controllers.ConstructorInjectedController;
import haydende.springframework.sfgdi.controllers.MyController;
import haydende.springframework.sfgdi.controllers.PropertyInjectedController;
import haydende.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		// MyController myController = (MyController) context.getBean("myController");
		// String greeting = myController.sayHello();
		// System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
