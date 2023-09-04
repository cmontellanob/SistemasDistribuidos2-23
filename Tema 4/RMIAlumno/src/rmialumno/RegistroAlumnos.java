/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmialumno;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class RegistroAlumnos extends UnicastRemoteObject implements IRegistroAlumnos{

    ArrayList<Alumno> listaAlumnos;
    
    public RegistroAlumnos() throws RemoteException{
        super();
    }
    @Override
    public Alumno registrarAlumno(Alumno alumno) throws RemoteException {
        this.listaAlumnos.add(alumno);
        return alumno;
    }

    @Override
    public Alumno[] listarAlumnos() throws RemoteException {
        Alumno[] auxiliar = new Alumno[this.listaAlumnos.size()];
        int i = 0;
        for (Alumno a: this.listaAlumnos){
            auxiliar[i] = a;
            i++;
        }
        return auxiliar;
    }
    
}
