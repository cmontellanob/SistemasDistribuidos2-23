package soquettcp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;


/**
 *
 * @author Carlos
 */
public class ClienteTCP {
    public static void main(String[] args) {
        {
            int port = 5002;
            try {
                Socket client = new Socket("localhost", port);
                PrintStream toServer = new PrintStream(client.getOutputStream());
                BufferedReader fromServer = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));
                toServer.println("Buenas Tardes");
                String result = fromServer.readLine();
                System.out.println("cadena devuelta es: " + result);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
}
