
package com.porfolio.miPorfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
        @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = descripcion;
        this.descripcion = descripcion;
    }
}
