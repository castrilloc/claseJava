/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piro_
 */
public class ingresarUnNumeroParOimpar {
/**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException { 
        System.out.println("Ingrese el numero:");
        Double numero = Double.valueOf(cargarNumero());
        
        Boolean esPar = (numero % 2) == 0;
        
        if (esPar) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }
    }
        private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.valueOf(strNumero);
        return numero;
    }
}
