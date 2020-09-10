package com.gestionpersonas.GestionPersonas.repository;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
