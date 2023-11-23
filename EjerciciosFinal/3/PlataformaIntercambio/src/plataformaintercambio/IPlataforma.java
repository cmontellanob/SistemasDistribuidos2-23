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
public interface IPlataforma extends Remote {
   public boolean realizarTransaccion(Cuenta cliente ,Cuenta vendedor ,Double monto) throws RemoteException;
}
