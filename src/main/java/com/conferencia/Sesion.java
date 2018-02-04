package com.conferencia;

import java.util.LinkedList;
import java.util.List;

public class Sesion {

    LinkedList<Charla> charla;
    private int tiempoMax;

    public Sesion() {
    }

    public Sesion(LinkedList<Charla> charla, int tiempoMax) {
        this.charla = charla;
        this.tiempoMax = tiempoMax;
    }

    public LinkedList<Charla> getCharla() {
        return charla;
    }

    public void setCharla(LinkedList<Charla> charla) {
        this.charla = charla;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }
}
