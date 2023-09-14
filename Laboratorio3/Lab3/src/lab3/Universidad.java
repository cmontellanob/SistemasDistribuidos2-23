/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.SocketException;
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
public class Universidad extends UnicastRemoteObject implements IUniversidad {

    public Universidad() throws RemoteException {
        super();
    }

    @Override
    public Diploma emitirDiploma(String CI, String Nombres, String p1erApellido, String p2doApellido, String fecha_nacimiento, String Carrera) throws RemoteException {
        Diploma aux = null;
        // Llamar a SEGIP ---- RMI ---------------------------------
        try {

            ISegip segip;
            String apellidos = p1erApellido + " " + p2doApellido;
            segip = (ISegip) Naming.lookup("rmi://localhost/Segip"); // instanciar un objeto remoto
            Respuesta respuesta = segip.Verificar(CI, Nombres, apellidos);

        } catch (NotBoundException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ------------------------------------------------

        // llamada a SEDUCA UDP ----------------------------------------
        int puerto = 6789;

        try {
            String rude = Nombres.substring(0, 2)+p1erApellido.substring(0,2)+...;
            String ip = "localhost";
            DatagramSocket socketUDP = new DatagramSocket();
            byte[] mensaje = rude.getBytes();
            InetAddress hostServidor = InetAddress.getByName(ip);

            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion
                    = new DatagramPacket(mensaje, dato.length(), hostServidor,
                            puerto);

            // Enviamos el datagrama
            socketUDP.send(peticion);

            // Construimos el DatagramPacket que contendrá la respuesta
            byte[] bufer = new byte[1000];
            DatagramPacket respuesta
                    = new DatagramPacket(bufer, bufer.length);
            socketUDP.receive(respuesta);

            // Enviamos la respuesta del servidor a la salida estandar
            String repuestaSeduca = new String(respuesta.getData());

            // Cerramos el socket
            socketUDP.close();

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
        return aux;
    }

}
