using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace WebApplication1
{
    /// <summary>
    /// Descripción breve de ServicioImpuestos
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioImpuestos : System.Web.Services.WebService
    {

        [WebMethod]
        public DateTime Sincronizar()
        {
            return DateTime.Now;
        }

        [WebMethod]
        public String ObtenerCufd()
        {
            return "AB0000134534521";
        }
        [WebMethod]
        public Respuesta EmitirFactura(int idAmbiente,int NIT,String cufd,int modalidad,Factura factura)
        {
            Respuesta aux = new Respuesta("Valido", "Recibido Correctamente" + factura.razonSocial);
            return aux;
        }

    }
}
