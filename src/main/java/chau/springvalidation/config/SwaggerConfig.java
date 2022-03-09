package chau.springvalidation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("chau.springvalidation"))
				.build()
				.apiInfo(new ApiInfoBuilder().title("Gira project")
						.version("1.0")
						.description("Education")
						.contact(new springfox.documentation.service.Contact("ChauLN","https://giraprojectchau.herokuapp.com/","chau@gmail.com")).build());
	}

}
