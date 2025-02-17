package com.example.cristiana.controller;

import com.example.cristiana.repository.MasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasaController {

    @Autowired
    private MasaRepository masaRepository;

    @GetMapping("/mese")
    public String getMese(Model model) {
        model.addAttribute("mese", masaRepository.findAll());
        return "mese"; // Se referă la mese.html din /templates
    }

}
