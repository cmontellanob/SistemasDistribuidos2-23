/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Diploma implements Serializable {
    private String ci;
    private String nombreCompleto;
    private String carrera;
    private String fecha;
    private String mensaje;

    public Diploma(String ci, String nombreCompleto, String carrera, String fecha, String mensaje) {
        this.ci = ci;
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Diploma{" + "ci=" + ci + ", nombreCompleto=" + nombreCompleto + ", carrera=" + carrera + ", fecha=" + fecha + ", mensaje=" + mensaje + '}';
    }
    
    
    
    
    
    
}
