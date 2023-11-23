/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformaintercambio;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class OperacionesBanco extends UnicastRemoteObject implements IBanco{

    public OperacionesBanco() throws RemoteException {
        super();
    }

    @Override
    public boolean retirar(Cuenta cuenta, Double monto) throws RemoteException {
        if (cuenta.banco==Banco.BNB){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean abonar(Cuenta cuenta, Double monto) throws RemoteException {
        if (cuenta.banco==Banco.BNB){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
