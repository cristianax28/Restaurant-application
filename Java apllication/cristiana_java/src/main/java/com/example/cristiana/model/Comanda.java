package com.example.cristiana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comenzi") // Numele tabelului din baza de date
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long idComanda;

    private Long idRezervare;
    private Long idProdus;
    private int cantitate;

    // Constructor fără parametri
    public Comanda() {
    }

    // Constructor cu toți parametrii
    public Comanda(Long idRezervare, Long idProdus, int cantitate) {
        this.idRezervare = idRezervare;
        this.idProdus = idProdus;
        this.cantitate = cantitate;
    }

    // Getteri și setteri
    public Long getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Long idComanda) {
        this.idComanda = idComanda;
    }

    public Long getIdRezervare() {
        return idRezervare;
    }

    public void setIdRezervare(Long idRezervare) {
        this.idRezervare = idRezervare;
    }

    public Long getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(Long idProdus) {
        this.idProdus = idProdus;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "idComanda=" + idComanda +
                ", idRezervare=" + idRezervare +
                ", idProdus=" + idProdus +
                ", cantitate=" + cantitate +
                '}';
    }
}
