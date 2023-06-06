package Profesor;
import Persona.Persona;
import java.util.List;
    public class Profesor extends Persona {
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
