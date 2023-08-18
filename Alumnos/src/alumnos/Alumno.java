/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

/**
 *
 * @author Carlos
 */
public class Alumno {
  String nombre ;
  String apellido;
  String ci;
  String cu;
  Sexo sexo;

    public Alumno(String nombre, String apellido, String ci, String cu, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.cu = cu;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", cu=" + cu + ", sexo=" + sexo + '}';
    }
  
  
  
  
    
}
