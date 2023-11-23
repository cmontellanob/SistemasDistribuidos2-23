/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plataformaintercambio;

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
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPlataforma plataforma;

        try {

            plataforma = (IPlataforma) Naming.lookup("rmi://localhost/PlataformaIntercambio"); // instanciar un objeto remoto
            Cliente cliente=new Cliente(123245, "", "Juan", "Perez", "Rojas");
            Cliente vendedor=new Cliente(345124, "", "Ricardo", "Martinez", "Loa");
            Cuenta c1=new Cuenta(Banco.BNB , 12345, cliente, 50.0);
            Cuenta c2=new Cuenta(Banco.BancoUnion , 125, vendedor, 5050.0);
            //verficr cuentas en la bd
            
            plataforma.realizarTransaccion(c1, c2, 30.5);
        } catch (NotBoundException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
