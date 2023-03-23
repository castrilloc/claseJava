/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

/**
 *
 * @author piro_
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        int suma = 0;
        
        String[] args1 = new String[]{"25", "6", "1"}; 
        
        for(int indice = 0; indice < args.length; indice++)
        {
            int numeroASumar = Integer.parseInt(args[indice]);
            suma = suma + numeroASumar;
        }
        
        for(String numeroString : args)
        {
            int numeroASumar = Integer.parseInt(numeroString);
            suma = suma + numeroASumar;
        }
        
        System.out.println("Suma " + suma);
    }
    
}
