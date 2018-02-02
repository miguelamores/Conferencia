package com.conferencia;

import java.util.List;

public class Conferencia {

    List<Tematica> tematica;

    public Conferencia(List<Tematica> tematica) {
        this.tematica = tematica;
    }

    public List<Tematica> getTematica() {
        return tematica;
    }

    public void setTematica(List<Tematica> tematica) {
        this.tematica = tematica;
    }
}
