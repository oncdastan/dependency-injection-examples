package ocd.springframework.dependencyinjectionexamples;

import ocd.springframework.dependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
				Here, you are not creating an object. You are asking Spring to provide an instance of that
			class from the context. Spring Framework manages the construction of MyController. So, this is
			one of the fundamental points of Dependency Injection is to have the framework doing all the
			management of it. The framework is creating objects and providing those instantiated objects.
		*/
		MyController myController = (MyController) context.getBean("myController");
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String greeting = myController.sayHello(); // Here, you are utilizing the created object to execute a method.

		System.out.println(greeting);
	}

}
