/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
/**
 *
 * @author reroes
 */
import java.util.Scanner;
import java.util.Locale;


public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double sumaventas;
               
        double ventastotales = 0;
        String mensaje = "";
        
        for (int i = 0; i < ventas.length; i++) { 
            sumaventas = 0;
            for (int j = 0; j < ventas[i].length; j++) { 
                System.out.println("Ingrese la ventas del día:");
                ventas[i][j] = entrada.nextDouble();
                sumaventas = sumaventas + ventas[i][j];
                ventastotales = ventastotales + sumaventas;
            }
        }
        
        for (int i = 0; i < vendedores.length; i++) {
            mensaje = String.format("%sVendedor(a) %s\n",
                    mensaje,vendedores[i]);
        }
        
        System.out.printf("%sHa realizado un total de %.2f en ventas.\n",
                mensaje, ventastotales);
    
    }
    
}
