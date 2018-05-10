package eu.b24u.demo.rest.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket producktApi() {
		// @formatter:off
		return new Docket(DocumentationType.SWAGGER_2).
				select().
				apis(RequestHandlerSelectors.basePackage("eu.b24u.demo.rest.resources")).
				paths(springfox.documentation.builders.PathSelectors.regex("/rest.*")).
				build().
				apiInfo(metaInfo());
		// @formatter:on

	}

	private ApiInfo metaInfo() {
		// @formatter:off
		ApiInfo apiInfo = new ApiInfo(
				"Spring Boot Swagger2 API",
				"details for a project",
				"0.0.1",
				"Terms of Service",
				new Contact("Jakub Olszewski", "http://github.com/jakub-olszewski", "j.b.olszewski@gmail.com"),
				"MIT License",
				"https://opensource.org/licenses/MIT", 
				new ArrayList<>()
				);
		return apiInfo;
		// @formatter:on
	}

}
