package empleadoempresa;


import Cliente.Cliente;
import Directivo.Directivo;
import Empleado.Empleado;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Nicolas", 26, 60000);
        Directivo directivo1 = new Directivo("Pedro", 40, "Gerente", 350000);
        Cliente cliente1 = new Cliente("Ana", 25, "123456789");

        System.out.println("Empleado:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Sueldo Bruto: " + empleado1.getSueldoBruto());

        System.out.println("\nDirectivo:");
        System.out.println("Nombre: " + directivo1.getNombre());
        System.out.println("Edad: " + directivo1.getEdad());
        System.out.println("Sueldo Bruto: " + directivo1.getSueldoBruto());
        System.out.println("Categoría: " + directivo1.getCategoria());
        System.out.println("Subordinados: " + directivo1.getSubordinados());

        System.out.println("\nCliente:");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Teléfono de Contacto: " + cliente1.getTelefonoContacto());
    }
}