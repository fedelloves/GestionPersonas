package com.gestionpersonas.GestionPersonas.controller;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import com.gestionpersonas.GestionPersonas.domain.Persona;
import com.gestionpersonas.GestionPersonas.service.PaisService;
import com.gestionpersonas.GestionPersonas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private PaisService paisService;

    @GetMapping("/personas")
    public String listaPersonas(Model model){
        List<Persona> personas = personaService.obtenerPersonas();
        model.addAttribute("titulo", "Lista de Personas");
        model.addAttribute("personas", personas);
        return "personas";
    }

    @GetMapping("/personas/agregar")
    public String agregar(Model model){
        Persona persona = new Persona();
        List<Pais> paises = paisService.obtenerPaises();
        model.addAttribute("titulo", "Nueva persona");
        model.addAttribute("persona", persona);
        model.addAttribute("paises", paises);
        return "formularioPersona";
    }


    @PostMapping("/personas/agregar/guardar")
    public String guardar(@Valid @ModelAttribute Persona persona, BindingResult result, Model model){
        List<Pais> paises = paisService.obtenerPaises();
        if(result.hasErrors()){
            model.addAttribute("persona", persona);
            model.addAttribute("paises", paises);
            return "formularioPersona";
        }
        this.personaService.guardar(persona);
        return "redirect:/personas";
    }

    @GetMapping("/personas/editar/{id}")
    public String editar(@PathVariable("id") Long idPersona, Model model){
        if(!personaService.existe(idPersona)){
            System.out.println("El ID a editar no existe");
            return "redirect:/personas";
        }else{
            Persona persona = personaService.buscarPorId(idPersona);
            List<Pais> paises = paisService.obtenerPaises();
            model.addAttribute("titulo", "Editar persona");
            model.addAttribute("persona", persona);
            model.addAttribute("paises", paises);
            return "formularioPersona";
        }

    }

    @GetMapping("/personas/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idPersona){
        if(!personaService.existe(idPersona)){
            System.out.println("El ID a editar no existe");
            return "redirect:/personas";
        }else{
            personaService.eliminar(idPersona);
            return "redirect:/personas";
        }

    }


}
