package Curso;
import Alumno.Alumno;
import Profesor.Profesor;
import java.util.List;
import java.util.Scanner;
public class Curso {
    private String nombre;
    private int cupo;
    private Profesor unProfe;
    private List<Alumno>alumnos;
    public Curso(String nombre, int cupo, Profesor unProfe, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.cupo = cupo;
        this.unProfe = unProfe;
        this.alumnos = alumnos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCupo() {
        return cupo;
    }
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    public Profesor getUnProfe() {
        return unProfe;
    }
    public void setUnProfe(Profesor unProfe) {
        this.unProfe = unProfe;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public void agregarAlumno(Alumno alumno){
        if(cupo>0){
            alumnos.add(alumno);
            cupo--;
            System.out.println("Alumno "+alumno.getNombre()+ " Incripto en el curso "+nombre);
            // Esperar a que el usuario presione una tecla
            System.out.println("Presione una tecla para continuar...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }else{
            System.out.println("EL CURSO " + nombre + " NO TIENE CUPOS DISPONIBLES.PESTAÑASTE REY");
        }
        
    }
}
