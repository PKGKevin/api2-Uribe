package com.example.api2.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Personajes")

public class Personajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer cantidadVida;
    private Integer poderAtaque;
    private Integer poderDefensa;
    private String fotografia;
    private String vivoMuerto;
    private String villano;
    private String heroeVillano;
    private LocalDate fechaCreacion;

    public Personajes() {
    }

    public Personajes(Integer id, String nombre, Integer cantidadVida, Integer poderAtaque, Integer poderDefensa, String fotografia, String vivoMuerto, String villano, String heroeVillano, LocalDate fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadVida = cantidadVida;
        this.poderAtaque = poderAtaque;
        this.poderDefensa = poderDefensa;
        this.fotografia = fotografia;
        this.vivoMuerto = vivoMuerto;
        this.villano = villano;
        this.heroeVillano = heroeVillano;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadVida() {
        return cantidadVida;
    }

    public Integer getPoderAtaque() {
        return poderAtaque;
    }

    public Integer getPoderDefensa() {
        return poderDefensa;
    }

    public String getFotografia() {
        return fotografia;
    }

    public String getVivoMuerto() {
        return vivoMuerto;
    }

    public String getVillano() {
        return villano;
    }

    public String getHeroeVillano() {
        return heroeVillano;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}


