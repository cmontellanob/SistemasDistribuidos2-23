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
public class Cotes extends UnicastRemoteObject implements IEmpresa {

public Cotes() throws RemoteException{
    super();
}  

    @Override
    public Factura[] pendientes(int idcliente) throws RemoteException {
        Factura[]aux=null;
        Empresa empresa=new Empresa("COTES",123123126L);
        switch (idcliente){
            case 1:
                aux=new Factura[3];
                aux[0]=new Factura(empresa, 154, Mes.Diciembre,2021, 170);
                aux[1]=new Factura(empresa, 321, Mes.Enero,2022, 100);
                aux[2]=new Factura(empresa, 22454, Mes.Febrero,2022, 150);
            break;
            case 2:
                aux=new Factura[2];
                aux[0]=new Factura(empresa, 225, Mes.Enero,2022, 150);
                aux[1]=new Factura(empresa, 1125, Mes.Febrero,2022, 200);
            break;
        }
        return aux;
    }

    @Override
    public String pagar(Factura[] facturas) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
