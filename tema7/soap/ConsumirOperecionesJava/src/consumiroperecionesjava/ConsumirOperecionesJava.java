/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumiroperecionesjava;

/**
 *
 * @author Carlos
 */
public class ConsumirOperecionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sumar(3,4));
    }

    private static int sumar(int a, int b) {
        servicios.Operaciones service = new servicios.Operaciones();
        servicios.OperacionesSoap port = service.getOperacionesSoap12();
        return port.sumar(a, b);
    }
    
}
