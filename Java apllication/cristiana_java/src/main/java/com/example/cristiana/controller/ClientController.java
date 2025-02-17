package com.example.cristiana.controller;

import com.example.cristiana.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clienti")
    public String listClienti(Model model) {
        model.addAttribute("clienti", clientRepository.findAll());
        return "clienti"; // Se referă la clienti.html din /templates
    }
}
