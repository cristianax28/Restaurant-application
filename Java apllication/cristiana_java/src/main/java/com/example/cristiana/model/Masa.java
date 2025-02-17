package com.example.cristiana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Masa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMasa;

    private Integer numarMasa;
    private Integer capacitate;
    private String localizare;

    // Getteri și setteri
    public Integer getIdMasa() {
        return idMasa;
    }

    public void setIdMasa(Integer idMasa) {
        this.idMasa = idMasa;
    }

    public Integer getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(Integer numarMasa) {
        this.numarMasa = numarMasa;
    }

    public Integer getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(Integer capacitate) {
        this.capacitate = capacitate;
    }

    public String getLocalizare() {
        return localizare;
    }

    public void setLocalizare(String localizare) {
        this.localizare = localizare;
    }
}
