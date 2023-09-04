/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmeplormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class HolaMundo extends UnicastRemoteObject implements IHolaMundo{

    public HolaMundo() throws RemoteException {
        super();
    }
    @Override
    public String HolaMundo() throws RemoteException {
        return "Hola Mundo";
    }
    
}
