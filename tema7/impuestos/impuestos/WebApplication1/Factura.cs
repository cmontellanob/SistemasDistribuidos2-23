using System;
using System.Collections.Generic;

namespace WebApplication1
{
    public class Factura
    {
        public int NIT;
        public string razonSocial;
        public DateTime fecha;
        public int numeroFactura;
        public string cuf;
        public string nombreCliente;
        public List<DetalleFactura> detalleFactura;
    }
}