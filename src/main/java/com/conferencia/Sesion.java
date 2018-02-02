package com.conferencia;

import java.util.List;

public class Sesion {

    List<Charla> charla;
    private int tiempoMax;

    public Sesion() {
    }

    public Sesion(List<Charla> charla) {
        this.charla = charla;
    }

    public List<Charla> getCharla() {
        return charla;
    }

    public void setCharla(List<Charla> charla) {
        this.charla = charla;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }
}
