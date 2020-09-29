package com.gestionpersonas.GestionPersonas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/index")
    public String inicio(Model model){
        return "index";

    }
}
