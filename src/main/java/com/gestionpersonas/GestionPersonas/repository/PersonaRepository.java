package com.gestionpersonas.GestionPersonas.repository;

import com.gestionpersonas.GestionPersonas.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
