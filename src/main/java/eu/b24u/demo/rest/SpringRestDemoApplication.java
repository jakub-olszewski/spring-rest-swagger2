package eu.b24u.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan
//@SpringBootApplication
//public class SpringRestDemoApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringRestDemoApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringRestDemoApplication.class, args);
//	}
//}

@ComponentScan
@SpringBootApplication
@EnableSwagger2 // this
public class SpringRestDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<SpringRestDemoApplication> applicationClass = SpringRestDemoApplication.class;
}

@RestController
class HelloController {

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable
	String name) {

		return "Hi " + name + " !";

	}
}