package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import com.gestionpersonas.GestionPersonas.repository.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PaisServiceImpl implements PaisService {

    private PaisRepository paisRepository;

    @Override
    public List<Pais> obtenerPaises() {
        List<Pais> paises = (List<Pais>) paisRepository.findAll();
        System.out.println(paises);
        return paises;
    }
}
