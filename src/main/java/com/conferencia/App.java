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

        Sesion sesion = new Sesion();
        LinkedList<Charla> listaCharlaTemp = new LinkedList<>();
        AtomicInteger duracionSesion = new AtomicInteger();
        datosOrdenados.forEach(chrl -> {
            duracionSesion.addAndGet(chrl.getDuracion());
            sesion.setTiempoMax(Integer.valueOf(String.valueOf(duracionSesion)));
            if (sesion.getTiempoMax() >= 180) {
                sesion.setCharla(listaCharlaTemp);
            }
            listaCharlaTemp.add(chrl);
            System.out.println(duracionSesion);
            //System.out.println(a.getDuracion());
        });

        /*leerDatos.temaCharla().forEach(datosEntrada -> {
            System.out.println(datosEntrada.getTema());
            System.out.println(datosEntrada.getDuracion());
        });*/


        /*for (Charla charla: rStream) {
            System.out.println(charla.getTema());
            System.out.println(charla.getDuracion());
        }*/
    }
}
