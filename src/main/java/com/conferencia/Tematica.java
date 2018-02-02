package com.conferencia;

import java.util.List;

public class Tematica {

    List<Sesion> sesion;

    public Tematica(List<Sesion> sesion) {
        this.sesion = sesion;
    }

    public List<Sesion> getSesion() {
        return sesion;
    }

    public void setSesion(List<Sesion> sesion) {
        this.sesion = sesion;
    }
}
