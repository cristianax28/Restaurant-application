package com.example.cristiana.controller;

import com.example.cristiana.repository.MeniuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeniuController {

    @Autowired
    private MeniuRepository meniuRepository;

    @GetMapping("/meniu")
    public String listMeniu(Model model) {
        model.addAttribute("meniu", meniuRepository.findAll());
        return "meniu"; // Se referă la meniu.html din /templates
    }
}
