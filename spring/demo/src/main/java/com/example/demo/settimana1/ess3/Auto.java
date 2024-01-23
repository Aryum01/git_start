package com.example.demo.settimana1.ess3;

import java.util.UUID;

public class Auto {
    private String marca;
    private String modello;
    private int numPorte;
    private int cilindrata;
    private UUID id;

    public Auto(String marca, String modello, int numPorte, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.numPorte = numPorte;
        this.cilindrata = cilindrata;
        this.id = UUID.randomUUID();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public UUID getId() {
        return id;
    }
}
