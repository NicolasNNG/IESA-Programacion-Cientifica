/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidad;

import Alumno.Alumno;
import Curso.Curso;
import Profesor.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Universidad {

   public static void main(String[] args) {
      
        // Crear objetos de ejemplo
        Alumno alumno1 = new Alumno("Nicolas", "12345678", "Neris", "123456789", "NNg@gmail.com", "A001");
        Alumno alumno2 = new Alumno("Yamila", "87654321", "Rodriguez", "987654321", "TheChamy@gmail.com", "A002");

        Profesor profesor1 = new Profesor(new ArrayList<>(), "Dario", "11111111", "Del Rosario");
        Profesor profesor2 = new Profesor(new ArrayList<>(), "Fernando", "22222222", "Espinoza");

        List<Alumno> alumnosCurso1 = new ArrayList<>();
        //alumnosCurso1.add(alumno1);
        //alumnosCurso1.add(alumno2);

        List<Alumno> alumnosCurso2 = new ArrayList<>();
        //alumnosCurso2.add(alumno1);
        //alumnosCurso2.add(alumno2);

        Curso curso1 = new Curso("Programación Científica", 1, profesor1, alumnosCurso1);
        Curso curso2 = new Curso("Programacion 2", 25, profesor2, alumnosCurso2);

        // Agregar alumnos a los cursos
        curso1.agregarAlumno(alumno1);
        curso1.agregarAlumno(alumno2);
        curso2.agregarAlumno(alumno1);
        curso2.agregarAlumno(alumno2);

        // Obtener alumnos inscritos en los cursos
        List<Alumno> alumnosEnCurso1 = curso1.getAlumnos();
        List<Alumno> alumnosEnCurso2 = curso2.getAlumnos();
        
        
        // Esperar a que el usuario presione una tecla
        System.out.println("Presione una tecla para mostrar los cursos...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Imprimir información de los cursos
        System.out.println("Curso: " + curso1.getNombre());
        System.out.println("Profesor: " + curso1.getUnProfe().getNombre());
        System.out.println("Cupo: " + curso1.getCupo());
        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : alumnosEnCurso1) {
            System.out.println(" - " + alumno.getNombre() + " (" + alumno.getMatricula() + ")");
        }
        System.out.println();

        System.out.println("Curso: " + curso2.getNombre());
        System.out.println("Profesor: " + curso2.getUnProfe().getNombre());
        System.out.println("Cupo: " + curso2.getCupo());
        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : alumnosEnCurso2) {
            System.out.println(" - " + alumno.getNombre() + " (" + alumno.getMatricula() + ")");
        }
    }
}
