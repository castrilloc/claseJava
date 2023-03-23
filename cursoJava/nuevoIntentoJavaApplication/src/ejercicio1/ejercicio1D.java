/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author CarlosCastrilo
 */
public class ejercicio1D {

    /**
     * @param args the command line arguments
     * usando una sentencia "for"
     * solo se muestran los números pares
     * en orden invertido
     */
    public static void main(String[] args) {
        int numeroInicio = 6;
        int numeroFin = 14;

        for(int i = numeroFin; i >= numeroInicio; i--){
            if(i % 2 == 0){
                    System.out.println(i);
            }
        }
    }
}