/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author CarlosCastrilo
 */
public class practicaMayorYmenorInput {

    /**
     * @param args the command line arguments
     * Determinar numero mayor por input
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (capturarTeclado);
        
        System.out.println("Ingrese el primer numero");
        String strNumero1 = buffer.readLine();
        Integer numero1 = Integer.parseInt(strNumero1);
        
        System.out.println("Ingrese el segundo numero");
        String strNumero2 = buffer.readLine();
        Integer numero2 = Integer.parseInt(strNumero2);
        
        
        System.out.println("Ingrese el tercer numero");
        String strNumero3 = buffer.readLine();
        Integer numero3 = Integer.parseInt(strNumero3);
        
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);


    }

    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMayor = numero1;
        
        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        if (numero3> numeroMayor){
            numeroMayor = numero3;
        }
        System.out.println("El numero mayor es: "+ numeroMayor);
    }
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMenor = numero1;
        
        if (numero2 < numeroMenor){
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor){
            numeroMenor = numero3;
        }
        System.out.println("El numero menor es: "+ numeroMenor);
    }
}

