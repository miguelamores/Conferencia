package com.conferencia;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LeerDatos leerDatos = new LeerDatos();
        List<Charla> rStream = leerDatos.temaCharla();

        for (Charla charla: rStream) {
            System.out.println(charla.getTema());
            System.out.println(charla.getDuracion());
        }
    }
}
