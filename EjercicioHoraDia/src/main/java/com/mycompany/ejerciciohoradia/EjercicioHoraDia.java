/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciohoradia;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class EjercicioHoraDia {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System .out.print("Ingrese la hora actual (Formato 24 horas):");
        int hora =sc.nextInt();
        System.out.print("Ingrese los minutos actuales: ");
        int minutos =sc.nextInt();
        
       if (hora == 12 && minutos == 0) {
            System.out.println("Es mediodía");
        } else if (hora == 0 && minutos == 0) {
            System.out.println("Es medianoche");
        } else if (hora >= 0 && hora < 6) {
            System.out.println("Es madrugada");
        } else if (hora >= 6 && hora < 12) {
            System.out.println("Es mañana");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Es tarde");
        } else {
            System.out.println("Es noche");
        }
        
        sc.close();
    }
}
