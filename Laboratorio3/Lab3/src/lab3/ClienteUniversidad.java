/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

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
public class ClienteUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            IUniversidad universidad;

            universidad = (IUniversidad) Naming.lookup("rmi://localhost/Universidad"); // instanciar un objeto remoto
            System.out.println(universidad.emitirDiploma(CI, Nombres, p1erApellido, p2doApellido, fecha_nacimiento, Carrera));
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
