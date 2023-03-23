/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

/**
 *
 * @author CarlosCastrillo
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
           
       }
   private static void cuenta (String[] args) {
        String numeroString = "44";
        int numeroInt = 44;
        
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        
        int suma = numero1 + numero2;
        
        System.out.println("Suma " + suma);
    }
    
}
