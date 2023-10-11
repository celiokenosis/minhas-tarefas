package br.com.tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class MinhasTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhasTarefasApplication.class, args);
	}

}
