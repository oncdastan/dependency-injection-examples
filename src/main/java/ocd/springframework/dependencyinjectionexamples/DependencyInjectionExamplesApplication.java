package ocd.springframework.dependencyinjectionexamples;

import ocd.springframework.dependencyinjectionexamples.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
				Above, it will throw an error and the output is going to look like this:

			----- Property
			Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'propertyInjectedController' available
				at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:874)
				at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1358)
				at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:309)
				at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
				at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154)
				at ocd.springframework.dependencyinjectionexamples.DependencyInjectionExamplesApplication.main(DependencyInjectionExamplesApplication.java:17)

			Process finished with exit code 1

				The reason for this error is that the Spring does not know that PropertyInjectedController is a component.
			To fix the issue, the controller class must be annotated with "@Controller". However, this is also going to
			result in a different error like this:


		*/

	}

}
