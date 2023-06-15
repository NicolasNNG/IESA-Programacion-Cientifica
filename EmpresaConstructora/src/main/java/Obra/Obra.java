/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obra;

import Empresa.Empresa;
import Materiales.Material;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class Obra {
    private String nombre;
    private List<Material>listaMateriales;
    private Empresa unaEmp;

    public Obra(String nombre, List<Material> listaMateriales, Empresa unaEmp) {
        this.nombre = nombre;
        this.listaMateriales = listaMateriales;
        this.unaEmp = unaEmp;
    }
    public double total(){
        double total=0;
        for(Material material :listaMateriales){
            total+=material.getCosto()*material.getCantidad();
        }
        return total;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(List<Material> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public Empresa getUnaEmp() {
        return unaEmp;
    }

    public void setUnaEmp(Empresa unaEmp) {
        this.unaEmp = unaEmp;
    }

   public void mostrarMAterialesComprados(){
       System.out.println("Materiales comprados en la obra. ");
       for(Material material : listaMateriales){
           System.out.println("-"+material.getNombre()+ " "+ "Cantidad " + material.getCantidad());
       }
   }
 
   
    
}
