package com.example.cristiana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Returnează login.html
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // Pagina principală după login
    }
}
