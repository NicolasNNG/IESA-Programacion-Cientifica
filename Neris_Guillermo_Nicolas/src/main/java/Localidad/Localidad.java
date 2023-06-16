/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Localidad;

import Provincia.Provincia;

/**
 *
 * @author niko_
 */
public class Localidad {
    private String nombre;
    private int codigoPostal;
    private Provincia unaProvincia;
    public Localidad(String nombre, int codigoPostal, Provincia unaProvincia) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.unaProvincia = unaProvincia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCodigoPostal() {
        return codigoPostal;
    }
    
    public Provincia getUnaProvincia() {
        return unaProvincia;
    }
}

