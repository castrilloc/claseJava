/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author CarlosCastrilo
 */
public class ejercicio2Asolo4 {

    /**
     * @param args the command line arguments
     * Determinar la clasificación de los hogares segun sus haberes
     */
    public static void main(String[] args) {
        byte trasportesDeLujo = 0;
        /*********************************************/
        if ((trasportesDeLujo >= 2)) 
        {System.out.println("Segmento de ingresos altos");
        } else if((trasportesDeLujo == 1)) 
        {System.out.println("Segmento de ingresos medios");
        } else if ((trasportesDeLujo == 0)) 
        {System.out.println("Segmento de menores ingresos");
        }
    }
}