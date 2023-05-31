/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

import Persona.Persona;

    class Alumno extends Persona {
    private String telefono;
    private String email;
    private String matricula;

    public Alumno(String nombre, String dni, String apellido, String telefono, String email, String matricula) {
        super(nombre, dni, apellido);
        this.telefono = telefono;
        this.email = email;
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
