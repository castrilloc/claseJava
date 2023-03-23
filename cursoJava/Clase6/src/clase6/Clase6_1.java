/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author CarlosCastrillo
 */
public class Clase6_1 {

    /**
     * función scanner
     * @param args the command line arguments
     */
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

                int mayor = 0;
                int[] numeros = new int[10];

                //numeros = generarArrayEnteros();

                for(int indice = 0; indice < numeros.length; indice++)
                {
                    System.out.println("Ingrese el numero " + (indice + 1));
                    numeros[indice] = teclado.nextInt();
                }

                for(int indice = 0; indice < numeros.length; indice++)
                {
                    if(numeros[indice] > mayor)
                    {
                        mayor = numeros[indice];
                    }
                }

        System.out.println("El numero mayor es: " + mayor);
    }  
}
