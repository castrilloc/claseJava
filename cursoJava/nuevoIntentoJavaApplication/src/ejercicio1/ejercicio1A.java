/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author CarlosCastrilo
 */
public class ejercicio1A {

    /**
     * @param args the command line arguments
     * Utilizando la sentencia while, imprima todos los
     * números entre 2 variables “a” y “b”
     */
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin ){
            System.out.println(numeroInicio++);
        }
    }
}
