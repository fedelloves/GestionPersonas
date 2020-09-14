package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import com.gestionpersonas.GestionPersonas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return (List<Persona>) personaRepository.findAll();

    }
}
