/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IBanco extends Remote {
    public Factura[] Calcular(int idcliente) throws RemoteException;
    public String Pagar(Factura[] facturas) throws RemoteException;
}
