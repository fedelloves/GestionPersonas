package com.gestionpersonas.GestionPersonas.repository;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Long> {
}
