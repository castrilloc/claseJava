/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;       
/**
 *
 * @author CarlosCastrilo
 */
public class ejercicio1B {

    /**
     * @param args the command line arguments
     * solo muestra los números pares
     */
    public static void main(String[] args) {
        int numeroInicio = 6;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin){
            if(numeroInicio % 2 == 0){
                    System.out.println(numeroInicio);
            }
            numeroInicio += 2;
        }
    }
}