using System;

namespace WebApplication1
{
    public class Respuesta
    {
        public String estado;
        public String mensaje;
        public Respuesta()
        {

        }
        public Respuesta(string estado, string mensaje)
        {
            this.estado = estado;
            this.mensaje = mensaje;
        }
    }
}