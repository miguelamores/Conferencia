package com.conferencia;

import java.util.List;

public class Sesion {

    List<Charla> charla;

    public Sesion(List<Charla> charla) {
        this.charla = charla;
    }

    public List<Charla> getCharla() {
        return charla;
    }

    public void setCharla(List<Charla> charla) {
        this.charla = charla;
    }
}
