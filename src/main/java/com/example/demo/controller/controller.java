package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@Controller
public class controller {
	@GetMapping("/acceuil")
    public String acceuil() {
        return "acceuil"; // Nom du fichier HTML sans l'extension .html
    }
    @GetMapping("/propos")
    public String propos() {
        return "propos"; // Nom de la vue pour la page À Propos
    }
    @GetMapping("/competence")
    public String competence() {
        return "competence"; // Nom de la vue pour la page competence
}
    @GetMapping("/projets")
    public String projets() {
        return "projets"; // Nom de la vue pour la page competence
}
    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Nom de la vue pour la page competence
}
}