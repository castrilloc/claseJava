/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases;

/**
 * sacar promedio
 * @author CarlosCastrillo
 */
public class clase5 {

public static void main(String[] args) {
        int numeros[] = new int[]{9, 10, 7, 7};
        double resultado = sumatoria(numeros);
        resultado = resultado / numeros.length;
        System.out.println(resultado);
        saludar();
    }

    private static int sumatoria(int[] numerosParaSumar) {
        int suma = 0;
        for (int index = 0; index < numerosParaSumar.length; index++) {
            suma = suma + numerosParaSumar[index];
        }
        return suma;
    }

    private static void saludar() {
        System.out.println("HOLA A TODOS!");
    }
}
