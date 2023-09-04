/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicas;

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
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IOperaciones op;
        try {

            op = (IOperaciones)Naming.lookup("rmi://localhost/Operacion"); // instanciar un objeto remoto
            System.out.println(op.Suma(3, 5));
            System.out.println(op.Resta(3, 5));
            System.out.println(op.Multiplicacion(3, 5));
            System.out.println(op.Division(3, 5));
            
        } catch (NotBoundException ex) {
            Logger.getLogger(OperacionesBasicas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(OperacionesBasicas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(OperacionesBasicas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
