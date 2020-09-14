package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonaService {

    public List<Persona> obtenerPersonas();
}
