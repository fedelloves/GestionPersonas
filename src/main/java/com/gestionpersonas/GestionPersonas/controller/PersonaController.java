package com.gestionpersonas.GestionPersonas.controller;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import com.gestionpersonas.GestionPersonas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public String listaPersonas(Model model){
        List<Persona> personas = personaService.obtenerPersonas();
        model.addAttribute("personas", personas);
        return "personas";
    }
}
