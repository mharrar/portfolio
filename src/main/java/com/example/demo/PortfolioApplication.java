package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        // Chargement du fichier var.env
        Dotenv dotenv = Dotenv.configure()
                              .filename("var.env")
                              .directory("C:\\Users\\Ce pc\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\Portfolio")
                              .load();
        
        System.setProperty("MAIL_USERNAME", dotenv.get("MAIL_USERNAME"));
        System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
        
        // Affichez les variables chargées
        System.out.println("MAIL_USERNAME: " + dotenv.get("MAIL_USERNAME"));
        System.out.println("MAIL_PASSWORD: " + dotenv.get("MAIL_PASSWORD"));
        
        SpringApplication.run(PortfolioApplication.class, args);
    }

}
