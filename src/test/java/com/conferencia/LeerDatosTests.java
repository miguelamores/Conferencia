package com.conferencia;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.*;

public class LeerDatosTests {

    LeerDatos leerDatos = new LeerDatos();

    @Test
    public void listLeerDatosShouldBeNotEmpty() {
        assertEquals(!leerDatos.temaCharla().isEmpty(), true);
    }

}
