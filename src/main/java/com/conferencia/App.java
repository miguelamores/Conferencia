package com.conferencia;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<Charla> datosOrdenados = new LinkedList<>();
        LinkedList<Sesion> sesiones = null;
        LeerDatos leerDatos = new LeerDatos();

        datosOrdenados = ordenarDatos(leerDatos);


        sesiones = ClasificarCharlas(datosOrdenados);

        int index = 0;
        LocalTime date4 = LocalTime.of(9, 00);
        for (Sesion sesion : sesiones) {
           if (index % 2 == 0){
                System.out.println("--Tematica--");
               date4 = LocalTime.of(9, 00);
            }

            for (Charla ch : sesion.getCharla()) {
                if (ch.getTema() == "Lunch") {
                    date4 = LocalTime.of(12,00);
                } if (ch.getTema() == "Networking Event") {
                    date4 = LocalTime.of(17,00);
                    System.out.println(date4 + " " +ch.getTema());
                }
                else {
                    System.out.println(date4 + " " +ch.getTema());
                    date4 = date4.plusMinutes(ch.getDuracion());
                }
            }
            index += 1;
        }

    }

    public static LinkedList<Charla> ordenarDatos(LeerDatos leerDatos) {
        LinkedList<Charla> datosOrdenados = new LinkedList<>();
        leerDatos.temaCharla().forEach(data -> {
            if (data.getDuracion() == 5) {
                datosOrdenados.addLast(data);
            } else {
                datosOrdenados.addFirst(data);
            }
        });
        return datosOrdenados;
    }

    public static LinkedList<Sesion> ClasificarCharlas(LinkedList<Charla> datosOrdenados) {
        LinkedList<Charla> listaCharlaS1 = new LinkedList<>();
        LinkedList<Charla> listaCharlaS2 = new LinkedList<>();
        LinkedList<Sesion> sesiones = new LinkedList<>();
        int duracionSesionDia = 0;
        int duracionSesionTarde = 0;
        Sesion sesion = null;

        while (!datosOrdenados.isEmpty()) {
            for (int i = 0; i <= datosOrdenados.size() - 1; i++) {
                duracionSesionDia += datosOrdenados.get(i).getDuracion();
                if (duracionSesionDia <= 180) {
                    listaCharlaS1.add(datosOrdenados.get(i));
                    datosOrdenados.remove(i);

                } else {

                    listaCharlaS2.add(datosOrdenados.get(i));
                    datosOrdenados.remove(i);

                    if (duracionSesionDia >= 405) {
                        sesion = new Sesion();
                        listaCharlaS1.addLast(new Charla("Lunch", 60));
                        sesion.setCharla(listaCharlaS1);
                        sesion.setTiempoMax(duracionSesionDia);
                        sesiones.add(sesion);
                        listaCharlaS1 = new LinkedList<>();

                        sesion = new Sesion();
                        listaCharlaS2.addLast(new Charla("Networking Event", 0));
                        sesion.setCharla(listaCharlaS2);
                        sesion.setTiempoMax(duracionSesionTarde);
                        sesiones.add(sesion);
                        listaCharlaS2 = new LinkedList<>();
                        duracionSesionDia = 0;
                        duracionSesionTarde = 0;
                    }
                }

            }
        }

        listaCharlaS1.addLast(new Charla("Lunch", 60));
        sesiones.add(new Sesion(listaCharlaS1,duracionSesionDia));

        listaCharlaS2.addLast(new Charla("Networking Event", 0));
        sesiones.add(new Sesion(listaCharlaS2,duracionSesionTarde));

        return sesiones;
    }
}
