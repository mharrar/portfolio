package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.EmailService;

@Controller
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public String sendContactEmail(@RequestParam String name, 
                                   @RequestParam String email, 
                                   @RequestParam String message, 
                                   Model model) {
        String subject = "Message de votre portfolio " + name;
        String text = "Nom: " + name + "\nEmail: " + email + "\nMessage: " + message;
        
        emailService.sendSimpleMessage("mehdi0harrar@gmail.com", subject, text);

        model.addAttribute("successMessage", "Votre message a été envoyé avec succès !");
        return "contact"; // Assurez-vous que ce soit le nom de votre vue (template Thymeleaf)
    }
}