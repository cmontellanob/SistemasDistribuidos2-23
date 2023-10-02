using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServiciosSOAP
{
    /// <summary>
    /// Descripción breve de Operaciones
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Operaciones : System.Web.Services.WebService
    {

        [WebMethod]
        public int sumar(int a,int b)
        {
            return a+b;
        }
        [WebMethod]
        public int restar(int a, int b)
        {
            return a - b;
        }
        [WebMethod]
        public int multiplicar(int a, int b)
        {
            return a * b;
        }
        [WebMethod]
        public int dividir(int a, int b)
        {
            return a / b;
        }
    }
}
