package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Visitante extends Persona {

    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante() {
    }

    public Visitante(String cedula, String nombre, String apellido, String telefono, String correo, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, telefono, correo);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString()+"Visitante{" +
                "motivo='" + motivo + '\'' +
                ", fechaEntrada=" + formato.format(fechaEntrada.getTime()) +
                ", fechaSalida=" + formato.format(fechaSalida.getTime()) +
                '}';
    }
}
