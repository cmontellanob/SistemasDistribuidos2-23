/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Banco extends UnicastRemoteObject implements IBanco {
public Banco() throws RemoteException{
    super();
}    

    @Override
    public Factura[] Calcular(int idcliente) throws RemoteException {
        System.out.println(idcliente);
        try {
        IEmpresa cessa,cotes;

        cessa = (IEmpresa) Naming.lookup("rmi://localhost/Cessa"); // instanciar un objeto remoto
        Factura[] facturasCessa=cessa.pendientes(idcliente);
        cotes = (IEmpresa) Naming.lookup("rmi://localhost/Cotes"); // instanciar un objeto remoto
        Factura[] facturasCotes=cotes.pendientes(idcliente);
        Factura[] auxiliar=new Factura[facturasCessa.length+facturasCotes.length];    
        int i=0;
        for (Factura factura:facturasCessa)
        {
            auxiliar[i]=factura;
            i++;
        }
        for (Factura factura:facturasCotes)
        {
            auxiliar[i]=factura;
            i++;
        }
        return auxiliar;        
    } catch (NotBoundException ex) {
        Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return null;
    }

    @Override
    public String Pagar(Factura[] facturas) throws RemoteException {
        String respuesta="";
    try {
        IEmpresa cessa,cotes;
        cessa = (IEmpresa) Naming.lookup("rmi://localhost/Cessa"); // instanciar un objeto remoto
        cotes = (IEmpresa) Naming.lookup("rmi://localhost/Cotes"); // instanciar un objeto remoto
        for (Factura factura:facturas)
        {
            if (factura.getEmpresa().getNombre().equals("CESSA"))
            {
            }
        }
    } catch (NotBoundException ex) {
        Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
    }
    return respuesta;    
    }
    
    
}
