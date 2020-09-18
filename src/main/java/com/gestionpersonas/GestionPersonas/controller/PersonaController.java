package com.gestionpersonas.GestionPersonas.controller;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import com.gestionpersonas.GestionPersonas.domain.Persona;
import com.gestionpersonas.GestionPersonas.service.PaisService;
import com.gestionpersonas.GestionPersonas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private PaisService paisService;

    @GetMapping("/personas")
    public String listaPersonas(Model model){
        List<Persona> personas = personaService.obtenerPersonas();
        model.addAttribute("personas", personas);
        return "personas";
    }

    @GetMapping("/agregar")
    public String agregar(Model model){
        Persona persona = new Persona();
        List<Pais> paises = paisService.obtenerPaises();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", paises);
        return "formularioPersona";
    }


    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Persona persona){
        this.personaService.guardar(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long idPersona, Model model){
        Persona persona = personaService.buscarPorId(idPersona);
        List<Pais> paises = paisService.obtenerPaises();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", paises);
        return "formularioPersona";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idPersona){
        personaService.eliminar(idPersona);
        return "redirect:/personas";
    }


}
