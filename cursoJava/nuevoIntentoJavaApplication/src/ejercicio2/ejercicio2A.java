/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author CarlosCastrilo
 */
public class ejercicio2A {

    /**
     * @param args the command line arguments
     * Determinar la clasificación de los hogares segun sus haberes
     */
    public static void main(String[] args) {
        double ingresosMensuales = 572386.50;
        byte cantidadVehiculosMenores5A =  3;
        byte cantidadInmuebles = 3;
        byte trasportesDeLujo = 1;
        /*********************************************/
        if ((ingresosMensuales >= 572386.50) ||
        (cantidadVehiculosMenores5A >= 3) ||
        (cantidadInmuebles >= 3) || (trasportesDeLujo >= 1)) 
        {System.out.println(   "Segmento de ingresos altos");
        } else if((ingresosMensuales <= 572386.49) ||
        (cantidadVehiculosMenores5A >= 1) ||
        (cantidadInmuebles <= 2) || (trasportesDeLujo == 0)) 
        {System.out.println("Segmento de ingresos medios");
        } else if ((ingresosMensuales <= 245308.50) ||
        (cantidadVehiculosMenores5A >= 0) ||
        (cantidadInmuebles <= 1) || (trasportesDeLujo == 0)) 
        {System.out.println("Segmento de menores ingresos");
        }
    }
}