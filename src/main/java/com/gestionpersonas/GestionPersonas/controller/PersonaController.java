package com.gestionpersonas.GestionPersonas.controller;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import com.gestionpersonas.GestionPersonas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public List<Persona> listaPersonas(){
        return personaService.obtenerPersonas();
    }
}
