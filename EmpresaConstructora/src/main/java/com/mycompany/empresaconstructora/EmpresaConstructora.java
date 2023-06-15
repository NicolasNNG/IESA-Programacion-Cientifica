/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresaconstructora;

import Empresa.Empresa;
import Materiales.Material;
import Obra.Obra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class EmpresaConstructora {
        public static void main(String[] args) {
        // Crear una instancia de la empresa
        Empresa empresa = new Empresa("Sacde", "123456", "Calle90");
        // Crear los materiales y la lista de materiales
        Material cemento = new Material("Cemento", 10, 500);
        List<Material> listaMateriales = new ArrayList<>();
        listaMateriales.add(cemento);
        // Crear una instancia de la obra
        Obra obra = new Obra("Ruta 12", listaMateriales, empresa);
        
       

        // Calcular el costo total de la obra
        double costoTotal = obra.total();

        // Imprimir el resultado
        System.out.println("El costo total de la obra es: $" + costoTotal);
        obra.mostrarMAterialesComprados();
    }
}

