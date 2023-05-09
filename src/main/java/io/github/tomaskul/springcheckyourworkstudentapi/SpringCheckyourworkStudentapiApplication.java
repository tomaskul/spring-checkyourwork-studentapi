package io.github.tomaskul.springcheckyourworkstudentapi;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCheckyourworkStudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCheckyourworkStudentapiApplication.class, args);
	}

	@Bean
	public OpenAPI publicAPI() {
		return new OpenAPI()
				.info(new Info().title("CheckYourWork - Student API")
						.description("Student API for CheckYourWork kata implementation.")
						.version("v0.0.1")
						/*.license(new License().name("Apache 2.0").url("http://springdoc.org"))*/)
				/*.externalDocs(new ExternalDocumentation()
						.description("SpringShop Wiki Documentation")
						.url("https://springshop.wiki.github.org/docs"))*/;
	}
}
