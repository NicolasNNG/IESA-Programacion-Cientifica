/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import Persona.Persona;

/**
 *
 * @author Nicolas
 */
public class Cliente extends Persona{
    private String telefonoContacto;

    public Cliente(String nombre, int edad,String telefonoContacto) {
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
    
}
