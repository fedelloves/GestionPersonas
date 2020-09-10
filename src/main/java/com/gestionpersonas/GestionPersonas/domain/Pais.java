package com.gestionpersonas.GestionPersonas.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name = "pais")
public class Pais {

    @Id
    @Column(name = "id_pais")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPais;
    @Column(name = "nombre")
    private String nombre;

    public Pais(){}

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
