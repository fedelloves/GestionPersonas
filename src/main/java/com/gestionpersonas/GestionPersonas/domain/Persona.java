package com.gestionpersonas.GestionPersonas.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Component
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String telefono;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pais")
    private Pais pais;


    public Persona(){}

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
