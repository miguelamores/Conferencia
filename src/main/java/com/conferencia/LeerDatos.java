package com.conferencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LeerDatos{

    String workingDir = System.getProperty("user.dir");
    final String CHARLAS = workingDir+"/src/main/java/com/conferencia/charlas.txt";

    public List<Charla> temaCharla () {
        List<Charla> listaCharlas= new ArrayList<>();
        try (Stream<String> line = Files.lines(Paths.get(CHARLAS))) {
            line.forEach(a -> {
                String[] b;
                if(a.matches(".*lightning.*")) {
                    b = a.replaceAll("lightning", "5min").split("(?=\\d)(?<!\\d)");
                } else {
                    b = a.split("(?=\\d)(?<!\\d)");
                }

                Charla charla = new Charla();
                charla.setTema(b[0]);
                charla.setDuracion(Integer.valueOf(b[1].replaceAll("\\D+","")));
                listaCharlas.add(charla);
                //System.out.println(b[0]);
                //System.out.println(b[1]);

            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCharlas;
    }

}
