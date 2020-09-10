package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaisService {

    public List<Pais> obtenerPaises();
}
