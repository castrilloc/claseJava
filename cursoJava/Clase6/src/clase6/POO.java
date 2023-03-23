/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clase6;

/**
 *
 * @author piro_
 */
public class POO {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreDelProducto = "";
        String codigoDeBarrasProducto1 = "";
        double precioProducto1 = 500;
        
        Producto producto1 = new Producto();
        producto1.nombreProducto = "Coca Cola Zero 1.5lts";
        producto1.codigoDeBarras = "7656565656565656";
        producto1.precio = 500;
        
        producto1.imprimirNombreDelProducto();
        
        System.out.println(producto1.nombreProducto);
        
        Producto producto2 = new Producto();
        producto2.nombreProducto = "Arroz Gallo Doble Carolina 1Kg";
        producto2.codigoDeBarras = "74878898986989";
        producto2.precio = 245;
    }   
}