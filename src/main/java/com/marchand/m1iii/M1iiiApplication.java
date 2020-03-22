package com.marchand.m1iii;

import com.marchand.m1iii.controller.ArticleController;
import com.marchand.m1iii.controller.CommandeController;
import com.marchand.m1iii.controller.ModeleController;
import com.marchand.m1iii.controller.RayonController;
import com.marchand.m1iii.service.ICommandeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.time.LocalDate;

@SpringBootApplication
@EnableSwagger2WebMvc
@ComponentScan(basePackages = {
		"com.marchand.m1iii.service",
		"com.marchand.m1iii.controller",
		"com.marchand.m1iii.model",
		"com.marchand.m1iii.repository",
})
public class M1iiiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(M1iiiApplication.class, args);
	}

	@Bean
	public Docket petApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/")
				.directModelSubstitute(LocalDate.class, String.class)
				.genericModelSubstitutes(ResponseEntity.class);
	}
}
