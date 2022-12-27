/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double[][] datos = new double[2][2];
        
        for (int i = 0 ; i < datos.length ; i++){
            for (int j = 0 ; j < datos.length ; j++){
                System.out.printf("Ingrese el valor de la fila %d y de la"
                        + " cloumna %d:\n", i+1 , j+1);
                datos[i][j] = entrada.nextDouble();
            }
        }
        for (int i = 0 ; i < datos.length ; i++){
            for (int j = 0 ; j < datos.length ; j++){
                System.out.printf("%s\t", datos[i][j]);
            }
            System.out.println();
        }
    }
}
