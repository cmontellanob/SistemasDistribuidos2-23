/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package plataformaintercambio;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IBanco  extends Remote {
    public boolean retirar(Cuenta cuenta,Double monto) throws RemoteException;
    public boolean abonar(Cuenta cuenta,Double monto) throws RemoteException;

    
}
