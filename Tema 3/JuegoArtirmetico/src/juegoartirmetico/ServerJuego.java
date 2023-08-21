/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoartirmetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;



/**
 *
 * @author Carlos
 */
public class ServerJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 5002;
        ServerSocket server;
        try {
            Juego juego=new Juego();
            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            
            
            String cadena=fromClient.readLine();
            if(cadena=="Iniciar")
            {
                juego.iniciar();
            }
            toClient = new PrintStream(client.getOutputStream());
            toClient.println("Hola Mundo");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
