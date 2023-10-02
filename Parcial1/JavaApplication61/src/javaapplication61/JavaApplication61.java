/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication61;

/**
 *
 * @author Carlos
 */
public class JavaApplication61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l= new Libro("Una prueba ", "un autor", "este es el contenido del libro");
        ILibro proxy=new ProxyLibro(l);
        System.out.println(proxy.leer());
    }
    
}
