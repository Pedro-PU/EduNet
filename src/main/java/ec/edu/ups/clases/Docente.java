package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente() {
        this.titulosAcademicos = new ArrayList<>();
        this.areasDeEspecializacion = new ArrayList<>();
    }

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulosAcademicos = new ArrayList<>();
        this.areasDeEspecializacion = new ArrayList<>();
    }

    public void addTituloAcademico(String tituloAcademico) {
        this.titulosAcademicos.add(tituloAcademico);
    }
    public List<String> getTituloAcademicos() {
        return titulosAcademicos;
    }

    public void addAreasDeEspecializacion(String areasDeEspecializacion) {
        this.areasDeEspecializacion.add(areasDeEspecializacion);
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspecializacion=" + areasDeEspecializacion +
                '}';
    }
}
