/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package argumentos;

import java.util.Scanner;

/**
 *
 * @author piro_
 */
public class EjemploScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mayor = 0;
        int[] numeros = new int[10];

//numeros = generarArrayEnteros();
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Ingrese el numero" + (indice + 1));
            numeros[indice] = teclado.nextInt();
        }
        numeros = new int[]{2, 34, 5, 7, 8, 12, 33, 28};

        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] > mayor) {
                mayor = numeros[indice];
            }
        }

    }

}
