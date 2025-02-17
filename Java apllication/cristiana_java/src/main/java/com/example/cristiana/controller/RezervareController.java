package com.example.cristiana.controller;

import com.example.cristiana.model.Rezervare;
import com.example.cristiana.repository.RezervareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RezervareController {

    @Autowired
    private RezervareRepository rezervareRepository;

    // Afișează lista de rezervări
    @GetMapping("/rezervari")
    public String listRezervari(Model model) {
        model.addAttribute("rezervari", rezervareRepository.findAll());
        return "rezervari";
    }

    // Form pentru adăugarea unei rezervări noi
    @GetMapping("/rezervari/new")
    public String showNewRezervareForm(Model model) {
        Rezervare rezervare = new Rezervare();
        model.addAttribute("rezervare", rezervare);
        return "Add_rezervare";
    }

    // Salvarea unei rezervări noi
    @PostMapping("/rezervari")
    public String saveRezervare(@ModelAttribute("rezervare") Rezervare rezervare) {
        rezervareRepository.save(rezervare);
        return "redirect:/rezervari";
    }

    // Form pentru editarea unei rezervări existente
    @GetMapping("/rezervari/edit/{id}")
    public String showEditRezervareForm(@PathVariable Long id, Model model) {
        Rezervare rezervare = rezervareRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid rezervare ID:" + id));
        model.addAttribute("rezervare", rezervare);
        return "edit_rezervare";
    }

    // Actualizarea rezervării existente
    @PostMapping("/rezervari/update/{id}")
    public String updateRezervare(@PathVariable Long id, @ModelAttribute("rezervare") Rezervare rezervare) {
        Rezervare existingRezervare = rezervareRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid rezervare ID:" + id));
        existingRezervare.setIdClient(rezervare.getIdClient());
        existingRezervare.setIdMasa(rezervare.getIdMasa());
        existingRezervare.setData(rezervare.getData());
        existingRezervare.setOra(rezervare.getOra());
        existingRezervare.setNumarPersoane(rezervare.getNumarPersoane());
        existingRezervare.setStatus(rezervare.getStatus());
        rezervareRepository.save(existingRezervare);
        return "redirect:/rezervari";
    }

    // Ștergerea unei rezervări
    @PostMapping("/rezervari/delete/{id}")
    public String deleteRezervare(@PathVariable Long id) {
        rezervareRepository.deleteById(id);
        return "redirect:/rezervari";
    }
}
