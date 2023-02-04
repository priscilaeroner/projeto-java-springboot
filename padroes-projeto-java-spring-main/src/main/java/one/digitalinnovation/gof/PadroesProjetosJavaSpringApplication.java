package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via STS.
 * Com adição dos módulos:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author michelabs
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetosJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetosJavaSpringApplication.class, args);
	}

}
