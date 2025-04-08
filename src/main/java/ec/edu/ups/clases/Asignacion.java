package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private Institucion institucion;
    private Direccion direccion;
    private GregorianCalendar fechaInicio;
    private Rol rol;


    public Asignacion() {}

    public Asignacion(Persona persona, Institucion institucion, Direccion direccion, GregorianCalendar fechaInicio, Rol rol) {
        this.persona = persona;
        this.institucion = institucion;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "persona=" + persona +
                ", institucion=" + institucion +
                ", direccion=" + direccion +
                ", fechaInicio=" + fechaInicio +
                ", rol=" + rol +
                '}';
    }
}
