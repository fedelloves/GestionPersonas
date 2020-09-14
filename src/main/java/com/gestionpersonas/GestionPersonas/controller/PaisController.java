package com.gestionpersonas.GestionPersonas.controller;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import com.gestionpersonas.GestionPersonas.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/paises")
    public String listarPaises(Model model){
        List<Pais> paises = paisService.obtenerPaises();
        model.addAttribute("paises", paises);
        return "paises";

    }
}
