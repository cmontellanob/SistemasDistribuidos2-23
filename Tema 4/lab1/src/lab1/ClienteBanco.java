/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

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
public class ClienteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            IBanco banco;
        try {

            banco = (IBanco) Naming.lookup("rmi://localhost/Banco"); // instanciar un objeto remoto
            Factura[] factura1=banco.Calcular(1);
            for (Factura f:factura1)
            {
                System.out.println(f);
            }
            //System.out.println(banco.Pagar(factura1));
            Factura[] factura2=banco.Calcular(2);
            for (Factura f:factura2)
            {
                System.out.println(f);
            }
            //System.out.println(banco.Pagar(factura2));
            
            // TODO code application logic here
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
