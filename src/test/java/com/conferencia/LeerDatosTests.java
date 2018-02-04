package com.conferencia;


import org.junit.Test;

//import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.*;

public class LeerDatosTests {

    LeerDatos leerDatos = new LeerDatos();

    @Test
    public void listLeerDatosShouldBeNotEmpty() {
        assertEquals(!leerDatos.temaCharla().isEmpty(), true);
    }

    @Test
    public void regexLightningShouldNotBeNull() {
        assertNotNull(leerDatos.regexLightning("lightning"));
        //assertEquals(leerDatos.regexLightning("lightning"), new String[]{"5min"});
    }

}
