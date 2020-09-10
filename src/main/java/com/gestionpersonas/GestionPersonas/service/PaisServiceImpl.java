package com.gestionpersonas.GestionPersonas.service;

import com.gestionpersonas.GestionPersonas.domain.Pais;
import com.gestionpersonas.GestionPersonas.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> obtenerPaises() {
        List<Pais> paises = (List<Pais>) paisRepository.findAll();
        System.out.println(paises);
        return paises;
    }
}
