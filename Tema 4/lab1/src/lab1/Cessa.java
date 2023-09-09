/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class Cessa extends UnicastRemoteObject implements IEmpresa {

public Cessa() throws RemoteException{
    super();
}  

    @Override
    public Factura[] pendientes(int idcliente) throws RemoteException {
        Factura[]aux=new Factura[2];
        Empresa empresa=new Empresa("CESSA",343123456L);
        switch (idcliente){
            case 1:
                aux[0]=new Factura(empresa, 154, Mes.Diciembre,2021, 150);
                aux[1]=new Factura(empresa, 326, Mes.Enero,2022, 701);
            break;
            case 2:
                aux[0]=new Factura(empresa, 325, Mes.Enero,2022, 610);
                aux[1]=new Factura(empresa, 457, Mes.Febrero,2022, 801);
            break;
        }
        return aux;
        
        
    }

    @Override
    public String pagar(Factura[] facturas) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
