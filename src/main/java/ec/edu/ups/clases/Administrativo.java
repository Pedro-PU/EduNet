package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo() {
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }
    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }

    public void addCargo(String cargo) {
        this.cargos.add(cargo);
    }
    public List<String> getCargos() {
        return cargos;
    }

    public void addResponsabilidade(String responsabilidade) {
        this.responsabilidades.add(responsabilidade);
    }
    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}
