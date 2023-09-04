/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package operacionesbasicas;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IOperaciones extends Remote{
    public int Suma (int a, int b) throws RemoteException;
    public int Resta (int a, int b)throws RemoteException;
    public int Multiplicacion (int a, int b)throws RemoteException;
    public double Division (int a, int b)throws RemoteException;
}
