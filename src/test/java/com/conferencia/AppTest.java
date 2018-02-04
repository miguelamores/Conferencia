package com.conferencia;

import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest {

    LeerDatos leerDatos = new LeerDatos();

    @Test
    public void ordenarDatosShouldReturnData(){
        assertNotNull(App.ordenarDatos(leerDatos));
    }

    @Test
    public void leerDatosAndOrdenarDatosShouldHaveSameSize() {
        assertEquals(App.ordenarDatos(leerDatos).size(), leerDatos.temaCharla().size());
    }

    @Test
    public void AnyConferenceShouldBeAtLeast5Minutes() {
        int duracion = App.ClasificarCharlas(App.ordenarDatos(leerDatos)).get(0).getCharla().get(1).getDuracion();
        assertTrue(duracion>=5);
    }

    @Test
    public void TheLastConferenceShouldBeTheNetworkingEvent() {
        String Event = App.ClasificarCharlas(App.ordenarDatos(leerDatos)).getLast().getCharla().getLast().getTema();
        assertEquals(Event, "Networking Event");
    }

}
