/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesbasicas;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Carlos
 */
public class Operaciones extends UnicastRemoteObject implements IOperaciones {
    
    public Operaciones() throws RemoteException {
    super();
    }
    @Override
    public int Suma(int a, int b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return  a + b;
    }

    @Override
    public int Resta(int a, int b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return a - b;
    }

    @Override
    public int Multiplicacion(int a, int b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return a * b;
    }

    @Override
    public double Division(int a, int b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return  a / b;
    }
    
}
