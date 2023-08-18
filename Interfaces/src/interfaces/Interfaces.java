/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<IFigura> lista =new ArrayList<IFigura>();
        IFigura cuadrado=new Cuadrado(4);
        lista.add(cuadrado);
        IFigura triangulo=new Triangulo(4.5,3.4);
        lista.add(triangulo);
        for (IFigura f:lista)
        {
            System.out.println(f.calcularArea());
        }
        
        
    }
    
}
