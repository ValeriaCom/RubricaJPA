package it.sirfin.RubricaJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages= {"it.sirfin.RubricaJPA"})
@EnableJpaRepositories(basePackages= {"it.sirfin.RubricaJPA.repository"})
@EntityScan(basePackages= {"it.sirfin.RubricaJPA.model"})

public class RubricaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubricaJpaApplication.class, args);
	}

}
