/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profesor;

import Persona.Persona;
import java.util.ArrayList;
import java.util.List;

    class Profesor extends Persona {
    private List<String> cursos;

    public Profesor(List<String> cursos, String nombre, String dni, String apellido) {
        super(nombre, dni, apellido);
        this.cursos = cursos;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

   

   
}

