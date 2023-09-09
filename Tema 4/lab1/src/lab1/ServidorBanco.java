/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

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
public class ServidorBanco {
    
       public static void main(String[] args) {
           try {
               Banco banco=new Banco();
               LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
               Naming.bind("Banco",banco);
           } catch (RemoteException ex) {
               Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
           } catch (AlreadyBoundException ex) {
               Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
           } catch (MalformedURLException ex) {
               Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       
       }
    
}
