/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Alumno alumno=null;
        while (opcion != 3) {
            System.out.println("1.- Crear Alumno");
            System.out.println("2.- Mostrar Alumno");
            System.out.println("3.- Salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca nombre");
                    String nombre=sc.next();
                    System.out.print("Introduzca apellido");
                    String apellido=sc.next();
                    System.out.print("Introduzca CI");
                    String ci=sc.next();
                    System.out.print("Introduzca CU");
                    String cu=sc.next();
                    System.out.print("Introduzca Sexo");
                    String se=sc.next();
                    alumno=new Alumno(nombre,apellido,ci,cu,Sexo.valueOf(se));
                    break;
                case 2:
                    System.out.println(alumno);
                    break;
            }
        }
    }

}
