package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Persona;


import java.util.List;

public interface PersonaService {

    public List<Persona> obtenerPersonas();
    public void guardar(Persona persona);
    public Persona buscarPorId(Long id);
    public void eliminar(Long id);
}
