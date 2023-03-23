/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author CarlosCastrillo
 */
public class clase5_2 {

    public static void main(String[] args) throws IOException {
        int numero1 = 50;
        int numero2 = 34;
              
        double resultado;
        
        resultado = suma(50, 34);
        
        String ubicacionArchivo = "C:\\clase5\\demo.txt";
        
        Files.write(Paths.get(ubicacionArchivo), "Que tal".getBytes());
        
    }
    public static int suma(int numero1, int numero2){
        int resultadoSuma = numero1 + numero2;
        return resultadoSuma;
    }
    public static int resta(){
        return 0;
    }
}