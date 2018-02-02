package com.conferencia;

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

        Charla charla = null;
        LinkedList<Charla> datosOrdenados = new LinkedList<>();
        LeerDatos leerDatos = new LeerDatos();

        leerDatos.temaCharla().forEach(data -> {
            if (data.getDuracion() == 5) {
                datosOrdenados.addLast(data);
            } else {
                datosOrdenados.addFirst(data);
            }
        });


        ClasificarCharlas(datosOrdenados);

        /*leerDatos.temaCharla().forEach(datosEntrada -> {
            System.out.println(datosEntrada.getTema());
            System.out.println(datosEntrada.getDuracion());
        });*/


        /*for (Charla charla: rStream) {
            System.out.println(charla.getTema());
            System.out.println(charla.getDuracion());
        }*/
    }

    private static void ClasificarCharlas(LinkedList<Charla> datosOrdenados) {
        LinkedList<Charla> listaCharlaTemp = new LinkedList<>();
        LinkedList<Sesion> sesiones = new LinkedList<>();
        //int duracionSesion = 0;
        Sesion sesion = new Sesion();
        /*for (Charla chrl: datosOrdenados) {
            duracionSesion += (chrl.getDuracion());
            if (duracionSesion <= 180) {
                sesion.setCharla(listaCharlaTemp);
                sesion.setTiempoMax(duracionSesion);
                listaCharlaTemp.add(chrl);
            } else {

            }

            System.out.println(duracionSesion);
        }*/
        /*datosOrdenados.forEach(chrl -> {
            duracionSesion.addAndGet(chrl.getDuracion());
            sesion.setTiempoMax(Integer.valueOf(String.valueOf(duracionSesion)));
            if (sesion.getTiempoMax() >= 180) {
                sesion.setCharla(listaCharlaTemp);

            }
            listaCharlaTemp.add(chrl);
            System.out.println(duracionSesion);
            //System.out.println(a.getDuracion());
        });*/
        AtomicInteger duracionSesion = new AtomicInteger();
        datosOrdenados.stream().filter(obj -> obj.getIsEstaAñadida() == false).forEach(chrl -> {
            duracionSesion.addAndGet(chrl.getDuracion());
            if (Integer.valueOf(duracionSesion.toString()) <= 180) {
                listaCharlaTemp.add(chrl);
                sesion.setCharla(listaCharlaTemp);
                sesion.setTiempoMax(Integer.valueOf(String.valueOf(duracionSesion)));
            }
            System.out.println(duracionSesion);
        });
    }
}
