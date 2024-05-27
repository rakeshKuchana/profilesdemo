package profilesdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import profilesdemo.service.UserService;

public class Demo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

		/*
		 * ClassPathXmlApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext( "applicationContext.xml");
		 */

		// ConfigurableEnvironment configurableEnvironment =
		// applicationContext.getEnvironment();

		// configurableEnvironment.setActiveProfiles("local");

		// applicationContext.register(ApplicationConfiguration.class);

		// applicationContext.refresh();

		UserService userService = applicationContext.getBean(UserService.class);

		userService.sendEmail();
	}

}
