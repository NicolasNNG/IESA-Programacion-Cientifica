/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directivo;

import Empleado.Empleado;
import java.util.*;

/**
 *
 * @author Nicolas
 */
public class Directivo extends  Empleado{
    private String categoria;
    private List <Empleado>subordinados;

    public Directivo(String nombre, int edad,String categoria, double sueldoBruto) {
        super(nombre, edad,sueldoBruto);
        this.categoria = categoria;
        this.subordinados=new ArrayList<>();
    }

    public String getCategoria() {
        return categoria;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }
}
