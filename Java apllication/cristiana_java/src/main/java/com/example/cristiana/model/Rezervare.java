package com.example.cristiana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rezervari") // Asigură-te că numele tabelului coincide cu cel din baza de date
public class Rezervare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long idRezervare;

    private Long idClient;
    private Long idMasa;
    private String data; // Format: YYYY-MM-DD
    private String ora;  // Format: HH:mm:ss
    private int numarPersoane;
    private String status;

    // Constructor fără parametri
    public Rezervare() {
    }

    // Constructor cu toți parametrii
    public Rezervare(Long idClient, Long idMasa, String data, String ora, int numarPersoane, String status) {
        this.idClient = idClient;
        this.idMasa = idMasa;
        this.data = data;
        this.ora = ora;
        this.numarPersoane = numarPersoane;
        this.status = status;
    }

    // Getteri și setteri
    public Long getIdRezervare() {
        return idRezervare;
    }

    public void setIdRezervare(Long idRezervare) {
        this.idRezervare = idRezervare;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdMasa() {
        return idMasa;
    }

    public void setIdMasa(Long idMasa) {
        this.idMasa = idMasa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "idRezervare=" + idRezervare +
                ", idClient=" + idClient +
                ", idMasa=" + idMasa +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                ", numarPersoane=" + numarPersoane +
                ", status='" + status + '\'' +
                '}';
    }
}
