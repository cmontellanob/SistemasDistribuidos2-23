/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformaintercambio;

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
public class PlataformaIntercambio extends UnicastRemoteObject implements IPlataforma {

    public PlataformaIntercambio() throws RemoteException {
        super();
    }

    @Override
    public boolean realizarTransaccion(Cuenta cliente, Cuenta vendedor, Double monto) throws RemoteException {
        IBanco bancoUnion;
        IBanco BNB;
        boolean resultado = false;

        try {

            bancoUnion = (IBanco) Naming.lookup("rmi://localhost/BancoUnion"); // instanciar un objeto remoto
            BNB = (IBanco) Naming.lookup("rmi://localhost/BancoNacional"); // instanciar un objeto remoto

            if (cliente.getBanco() == Banco.BNB) {
                if (vendedor.getBanco() == Banco.BNB) {
                    // Cliente  y vendedor BNB

                    if (BNB.retirar(cliente, monto) == false) {
                        return false;
                    }
                    BNB.abonar(vendedor, monto - monto * 0.02);
                    return true;
                } else {
                    // cliente BNB vendedor Banco Union

                    if (BNB.retirar(cliente, monto) == false) {
                        return false;
                    }
                    bancoUnion.abonar(vendedor, monto - monto * 0.02);
                    return true;

                }
            } else {
                if (vendedor.getBanco() == Banco.BNB) {
                    // Cliente  Union vendedor BNB
                   

                    if (bancoUnion.retirar(cliente, monto) == false) {
                        return false;
                    }
                    BNB.abonar(vendedor, monto - monto * 0.02);
                    return true;
                } else {
                    // Cliente  y vendedor Banco Union
                    if (bancoUnion.retirar(cliente, monto) == false) {
                        return false;
                    }
                    bancoUnion.abonar(vendedor, monto - monto * 0.02);
                    return true;
                    
                }
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

}
