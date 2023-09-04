/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmeplormi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class EjmeploRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IHolaMundo hola;

        try {

            hola = (IHolaMundo) Naming.lookup("rmi://localhost/HolaMundo"); // instanciar un objeto remoto
            System.out.println(hola.HolaMundo());
        } catch (NotBoundException ex) {
            Logger.getLogger(EjmeploRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(EjmeploRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(EjmeploRMI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
