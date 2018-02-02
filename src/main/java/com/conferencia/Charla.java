package com.conferencia;

public class Charla {

    private String tema;
    private int duracion;
    private boolean estaAñadida = false;

    public Charla() {

    }

    public Charla(String tema, int duracion) {
        this.tema = tema;
        this.duracion = duracion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean getIsEstaAñadida() {
        return estaAñadida;
    }

    public void setEstaAñadida(boolean estaAñadida) {
        this.estaAñadida = estaAñadida;
    }
}
