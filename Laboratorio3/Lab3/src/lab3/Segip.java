/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class Segip extends UnicastRemoteObject  implements ISegip{
     public Segip() throws RemoteException{
        super();
    } 

    @Override
    public Respuesta Verificar(String CI, String Nombres, String Apellido) throws RemoteException {
        Respuesta respuesta=null;
        if (CI.equals("1140506") && Nombres.equals("Walter Jhamil") && Apellido.equals("Segovi Arellano"))
        {
            respuesta=new Respuesta(true,"Verificacion Correcta");
        }
        else
        {
            respuesta=new Respuesta(false,"Datos del CI no son correctos");
            
        }
        return respuesta;
    }
    
}
