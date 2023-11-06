/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturadorjava;

import Impuestos.Respuesta;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Carlos
 */
public class FacturadorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cufd=obtenerCufd();
        System.out.print(cufd);
        XMLGregorianCalendar cal=sincronizar();
        System.out.print(cal);
        Impuestos.Factura factura;
        
        Respuesta rsp=emitirFactura(1, 123245,cufd , 1, factura) {
    }

    private static String obtenerCufd() {
        Impuestos.ServicioImpuestos service = new Impuestos.ServicioImpuestos();
        Impuestos.ServicioImpuestosSoap port = service.getServicioImpuestosSoap();
        return port.obtenerCufd();
    }

    private static XMLGregorianCalendar sincronizar() {
        Impuestos.ServicioImpuestos service = new Impuestos.ServicioImpuestos();
        Impuestos.ServicioImpuestosSoap port = service.getServicioImpuestosSoap();
        return port.sincronizar();
    }

    private static Respuesta emitirFactura(int idAmbiente, int nit, java.lang.String cufd, int modalidad, Impuestos.Factura factura) {
        Impuestos.ServicioImpuestos service = new Impuestos.ServicioImpuestos();
        Impuestos.ServicioImpuestosSoap port = service.getServicioImpuestosSoap();
        return port.emitirFactura(idAmbiente, nit, cufd, modalidad, factura);
    }
    
}
