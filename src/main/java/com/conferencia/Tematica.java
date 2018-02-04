package com.conferencia;

import java.util.LinkedList;
import java.util.List;

public class Tematica {

    LinkedList<Sesion> sesion;

    public Tematica(LinkedList<Sesion> sesion) {
        this.sesion = sesion;
    }

    public List<Sesion> getSesion() {
        return sesion;
    }

    public void setSesion(LinkedList<Sesion> sesion) {
        this.sesion = sesion;
    }
}
