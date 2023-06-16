/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.neris_guillermo_nicolas;

import Domicilio.Domicilio;
import Localidad.Localidad;
import Provincia.Provincia;

/**
 *
 * @author niko_
 */
public class Neris_Guillermo_Nicolas {

    public static void main(String[] args) {
        Provincia provincia = new Provincia("Misiones");
        Localidad unaLoca = new Localidad("Obera", 3300, provincia);
        Domicilio domicilio = new Domicilio("Buenos Aires", 123, unaLoca);
        String calle = domicilio.getCalle();
        int numero = domicilio.getNumero();
        Localidad localidad = domicilio.getUnaLoca();
        String nombreLocalidad = localidad.getNombre();
        int codigoPostal = localidad.getCodigoPostal();
        Provincia provinciaUnaLoca = localidad.getUnaProvincia();
        String nombreProvincia = provinciaUnaLoca.getNombre();
        
        // Imprimir los datos obtenidos
        System.out.println("Calle: " + calle);
        System.out.println("Número: " + numero);
        System.out.println("Nombre de la localidad: " + nombreLocalidad);
        System.out.println("Código postal: " + codigoPostal);
        System.out.println("Nombre de la provincia: " + nombreProvincia);
    }
}
    

