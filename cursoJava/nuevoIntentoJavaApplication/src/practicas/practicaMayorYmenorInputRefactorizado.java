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
public class practicaMayorYmenorInputRefactorizado {

    /**
     * @param args the command line arguments
     * Determinar numero mayor por input
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // solicitud de ingresar número
        System.out.println("Ingrese el primer numero");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero");
        Integer numero2 = cargarNumero();
        
        
        System.out.println("Ingrese el tercer numero");
        Integer numero3 = cargarNumero();
        
        //cálculo de número mayor y menor
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    /**
     * esta función sirve para mostrar el calculo de un numero mayor
     * @param numero1 es el primer número
     * @param numero2  es el segundo número
     * @param numero3  es el tercer número
     */
    
    
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

