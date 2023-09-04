/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmialumno;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IRegistroAlumnos extends Remote{
    public Alumno registrarAlumno(Alumno alumno) throws RemoteException;
    public Alumno[] listarAlumnos() throws RemoteException;
    
}
