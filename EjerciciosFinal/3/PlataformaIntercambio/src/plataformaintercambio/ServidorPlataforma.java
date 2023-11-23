/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformaintercambio;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorPlataforma {
    
    public static void main(String[] args) {
    
       
        try {
            PlataformaIntercambio plataforma=new PlataformaIntercambio();
            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("PlataformaIntercambio",plataforma);
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorPlataforma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorPlataforma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorPlataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        
    }
    
    
}
