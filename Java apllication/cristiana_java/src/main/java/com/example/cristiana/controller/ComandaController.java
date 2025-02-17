package com.example.cristiana.controller;

import com.example.cristiana.model.Comanda;
import com.example.cristiana.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComandaController {

    @Autowired
    private ComandaRepository comandaRepository;

    @GetMapping("/comenzi")
    public String getComenzi(Model model) {
        model.addAttribute("comenzi", comandaRepository.findAll());
        return "comenzi"; // Acesta este numele fișierului HTML din resources/templates
    }
}
