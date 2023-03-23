/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clase6;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author piro_
 */
public class cuestionario {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        URI archivo;
        for (String linea : Files.readAllLines(Paths.get(archivo))){

if(linea.startswith(“*”)){

System.out.println(linea);

}

}
    }

}
