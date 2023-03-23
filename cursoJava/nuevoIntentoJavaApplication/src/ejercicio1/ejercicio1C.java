/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author CarlosCastrillo
 */
public class ejercicio1C {

    /**
     * @param args the command line arguments
     * con una variable extra, se elije si se deben mostrar
     * los números pares o impares
     */
    public static void main(String[] args) {
    int numeroPar = 6;
    int numeroImpar = 5;
    int numeroFin = 14;
    boolean mostrarPares = false;

    while (numeroPar <= numeroFin && numeroImpar <= numeroFin) {
        if (mostrarPares) {
            if (numeroPar % 2 == 0) {
                System.out.println(numeroPar);
            }
            numeroPar += 2;
        } else {
            if (numeroImpar % 2 == 1) {
                System.out.println(numeroImpar);
            }
            numeroImpar += 2;
            }
        }
    }
}