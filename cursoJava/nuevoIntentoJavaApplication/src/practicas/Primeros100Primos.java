/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.io.IOException;

/**
 *
 * @author piro_
 */
public class Primeros100Primos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        String resultado = "";

        int contador = 0;
        int numero = 1;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
    }

    private static Boolean esPrimo(Integer numero) {
        Boolean esUnNumeroPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}
