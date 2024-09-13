package com.example.demo;

import org.springframework.boot.SpringApplication;
import io.github.cdimascio.dotenv.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		// Chargement du fichier var.env
        Dotenv dotenv = Dotenv.configure()
                              .filename("var.env") // Spécifiez le nom du fichier
                              .directory("C:/Users/Ce pc/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/Portfolio") // Spécifiez le chemin du fichier
                              .load();

		SpringApplication.run(PortfolioApplication.class, args);
	}

}
