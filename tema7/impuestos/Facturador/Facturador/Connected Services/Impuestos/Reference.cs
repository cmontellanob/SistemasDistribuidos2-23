﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Impuestos
{
    using System.Runtime.Serialization;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Factura", Namespace="http://tempuri.org/")]
    public partial class Factura : object
    {
        
        private int NITField;
        
        private string razonSocialField;
        
        private System.DateTime fechaField;
        
        private int numeroFacturaField;
        
        private string cufField;
        
        private string nombreClienteField;
        
        private Impuestos.DetalleFactura[] detalleFacturaField;
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true)]
        public int NIT
        {
            get
            {
                return this.NITField;
            }
            set
            {
                this.NITField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string razonSocial
        {
            get
            {
                return this.razonSocialField;
            }
            set
            {
                this.razonSocialField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=2)]
        public System.DateTime fecha
        {
            get
            {
                return this.fechaField;
            }
            set
            {
                this.fechaField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=3)]
        public int numeroFactura
        {
            get
            {
                return this.numeroFacturaField;
            }
            set
            {
                this.numeroFacturaField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=4)]
        public string cuf
        {
            get
            {
                return this.cufField;
            }
            set
            {
                this.cufField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=5)]
        public string nombreCliente
        {
            get
            {
                return this.nombreClienteField;
            }
            set
            {
                this.nombreClienteField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=6)]
        public Impuestos.DetalleFactura[] detalleFactura
        {
            get
            {
                return this.detalleFacturaField;
            }
            set
            {
                this.detalleFacturaField = value;
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="DetalleFactura", Namespace="http://tempuri.org/")]
    public partial class DetalleFactura : object
    {
        
        private int cantidadField;
        
        private string productoField;
        
        private double precioUnitarioField;
        
        private double precioTotalField;
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true)]
        public int cantidad
        {
            get
            {
                return this.cantidadField;
            }
            set
            {
                this.cantidadField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string producto
        {
            get
            {
                return this.productoField;
            }
            set
            {
                this.productoField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=2)]
        public double precioUnitario
        {
            get
            {
                return this.precioUnitarioField;
            }
            set
            {
                this.precioUnitarioField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=3)]
        public double precioTotal
        {
            get
            {
                return this.precioTotalField;
            }
            set
            {
                this.precioTotalField = value;
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Respuesta", Namespace="http://tempuri.org/")]
    public partial class Respuesta : object
    {
        
        private string estadoField;
        
        private string mensajeField;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string estado
        {
            get
            {
                return this.estadoField;
            }
            set
            {
                this.estadoField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string mensaje
        {
            get
            {
                return this.mensajeField;
            }
            set
            {
                this.mensajeField = value;
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="Impuestos.ServicioImpuestosSoap")]
    public interface ServicioImpuestosSoap
    {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/Sincronizar", ReplyAction="*")]
        System.Threading.Tasks.Task<System.DateTime> SincronizarAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerCufd", ReplyAction="*")]
        System.Threading.Tasks.Task<Impuestos.ObtenerCufdResponse> ObtenerCufdAsync(Impuestos.ObtenerCufdRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/EmitirFactura", ReplyAction="*")]
        System.Threading.Tasks.Task<Impuestos.EmitirFacturaResponse> EmitirFacturaAsync(Impuestos.EmitirFacturaRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class ObtenerCufdRequest
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="ObtenerCufd", Namespace="http://tempuri.org/", Order=0)]
        public Impuestos.ObtenerCufdRequestBody Body;
        
        public ObtenerCufdRequest()
        {
        }
        
        public ObtenerCufdRequest(Impuestos.ObtenerCufdRequestBody Body)
        {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class ObtenerCufdRequestBody
    {
        
        public ObtenerCufdRequestBody()
        {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class ObtenerCufdResponse
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="ObtenerCufdResponse", Namespace="http://tempuri.org/", Order=0)]
        public Impuestos.ObtenerCufdResponseBody Body;
        
        public ObtenerCufdResponse()
        {
        }
        
        public ObtenerCufdResponse(Impuestos.ObtenerCufdResponseBody Body)
        {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class ObtenerCufdResponseBody
    {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string ObtenerCufdResult;
        
        public ObtenerCufdResponseBody()
        {
        }
        
        public ObtenerCufdResponseBody(string ObtenerCufdResult)
        {
            this.ObtenerCufdResult = ObtenerCufdResult;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class EmitirFacturaRequest
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="EmitirFactura", Namespace="http://tempuri.org/", Order=0)]
        public Impuestos.EmitirFacturaRequestBody Body;
        
        public EmitirFacturaRequest()
        {
        }
        
        public EmitirFacturaRequest(Impuestos.EmitirFacturaRequestBody Body)
        {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class EmitirFacturaRequestBody
    {
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=0)]
        public int idAmbiente;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=1)]
        public int NIT;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=2)]
        public string cufd;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=3)]
        public int modalidad;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=4)]
        public Impuestos.Factura factura;
        
        public EmitirFacturaRequestBody()
        {
        }
        
        public EmitirFacturaRequestBody(int idAmbiente, int NIT, string cufd, int modalidad, Impuestos.Factura factura)
        {
            this.idAmbiente = idAmbiente;
            this.NIT = NIT;
            this.cufd = cufd;
            this.modalidad = modalidad;
            this.factura = factura;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class EmitirFacturaResponse
    {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="EmitirFacturaResponse", Namespace="http://tempuri.org/", Order=0)]
        public Impuestos.EmitirFacturaResponseBody Body;
        
        public EmitirFacturaResponse()
        {
        }
        
        public EmitirFacturaResponse(Impuestos.EmitirFacturaResponseBody Body)
        {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class EmitirFacturaResponseBody
    {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public Impuestos.Respuesta EmitirFacturaResult;
        
        public EmitirFacturaResponseBody()
        {
        }
        
        public EmitirFacturaResponseBody(Impuestos.Respuesta EmitirFacturaResult)
        {
            this.EmitirFacturaResult = EmitirFacturaResult;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    public interface ServicioImpuestosSoapChannel : Impuestos.ServicioImpuestosSoap, System.ServiceModel.IClientChannel
    {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Tools.ServiceModel.Svcutil", "2.1.0")]
    public partial class ServicioImpuestosSoapClient : System.ServiceModel.ClientBase<Impuestos.ServicioImpuestosSoap>, Impuestos.ServicioImpuestosSoap
    {
        
        /// <summary>
        /// Implemente este método parcial para configurar el punto de conexión de servicio.
        /// </summary>
        /// <param name="serviceEndpoint">El punto de conexión para configurar</param>
        /// <param name="clientCredentials">Credenciales de cliente</param>
        static partial void ConfigureEndpoint(System.ServiceModel.Description.ServiceEndpoint serviceEndpoint, System.ServiceModel.Description.ClientCredentials clientCredentials);
        
        public ServicioImpuestosSoapClient(EndpointConfiguration endpointConfiguration) : 
                base(ServicioImpuestosSoapClient.GetBindingForEndpoint(endpointConfiguration), ServicioImpuestosSoapClient.GetEndpointAddress(endpointConfiguration))
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public ServicioImpuestosSoapClient(EndpointConfiguration endpointConfiguration, string remoteAddress) : 
                base(ServicioImpuestosSoapClient.GetBindingForEndpoint(endpointConfiguration), new System.ServiceModel.EndpointAddress(remoteAddress))
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public ServicioImpuestosSoapClient(EndpointConfiguration endpointConfiguration, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(ServicioImpuestosSoapClient.GetBindingForEndpoint(endpointConfiguration), remoteAddress)
        {
            this.Endpoint.Name = endpointConfiguration.ToString();
            ConfigureEndpoint(this.Endpoint, this.ClientCredentials);
        }
        
        public ServicioImpuestosSoapClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress)
        {
        }
        
        public System.Threading.Tasks.Task<System.DateTime> SincronizarAsync()
        {
            return base.Channel.SincronizarAsync();
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Impuestos.ObtenerCufdResponse> Impuestos.ServicioImpuestosSoap.ObtenerCufdAsync(Impuestos.ObtenerCufdRequest request)
        {
            return base.Channel.ObtenerCufdAsync(request);
        }
        
        public System.Threading.Tasks.Task<Impuestos.ObtenerCufdResponse> ObtenerCufdAsync()
        {
            Impuestos.ObtenerCufdRequest inValue = new Impuestos.ObtenerCufdRequest();
            inValue.Body = new Impuestos.ObtenerCufdRequestBody();
            return ((Impuestos.ServicioImpuestosSoap)(this)).ObtenerCufdAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Impuestos.EmitirFacturaResponse> Impuestos.ServicioImpuestosSoap.EmitirFacturaAsync(Impuestos.EmitirFacturaRequest request)
        {
            return base.Channel.EmitirFacturaAsync(request);
        }
        
        public System.Threading.Tasks.Task<Impuestos.EmitirFacturaResponse> EmitirFacturaAsync(int idAmbiente, int NIT, string cufd, int modalidad, Impuestos.Factura factura)
        {
            Impuestos.EmitirFacturaRequest inValue = new Impuestos.EmitirFacturaRequest();
            inValue.Body = new Impuestos.EmitirFacturaRequestBody();
            inValue.Body.idAmbiente = idAmbiente;
            inValue.Body.NIT = NIT;
            inValue.Body.cufd = cufd;
            inValue.Body.modalidad = modalidad;
            inValue.Body.factura = factura;
            return ((Impuestos.ServicioImpuestosSoap)(this)).EmitirFacturaAsync(inValue);
        }
        
        public virtual System.Threading.Tasks.Task OpenAsync()
        {
            return System.Threading.Tasks.Task.Factory.FromAsync(((System.ServiceModel.ICommunicationObject)(this)).BeginOpen(null, null), new System.Action<System.IAsyncResult>(((System.ServiceModel.ICommunicationObject)(this)).EndOpen));
        }
        
        private static System.ServiceModel.Channels.Binding GetBindingForEndpoint(EndpointConfiguration endpointConfiguration)
        {
            if ((endpointConfiguration == EndpointConfiguration.ServicioImpuestosSoap))
            {
                System.ServiceModel.BasicHttpBinding result = new System.ServiceModel.BasicHttpBinding();
                result.MaxBufferSize = int.MaxValue;
                result.ReaderQuotas = System.Xml.XmlDictionaryReaderQuotas.Max;
                result.MaxReceivedMessageSize = int.MaxValue;
                result.AllowCookies = true;
                return result;
            }
            if ((endpointConfiguration == EndpointConfiguration.ServicioImpuestosSoap12))
            {
                System.ServiceModel.Channels.CustomBinding result = new System.ServiceModel.Channels.CustomBinding();
                System.ServiceModel.Channels.TextMessageEncodingBindingElement textBindingElement = new System.ServiceModel.Channels.TextMessageEncodingBindingElement();
                textBindingElement.MessageVersion = System.ServiceModel.Channels.MessageVersion.CreateVersion(System.ServiceModel.EnvelopeVersion.Soap12, System.ServiceModel.Channels.AddressingVersion.None);
                result.Elements.Add(textBindingElement);
                System.ServiceModel.Channels.HttpTransportBindingElement httpBindingElement = new System.ServiceModel.Channels.HttpTransportBindingElement();
                httpBindingElement.AllowCookies = true;
                httpBindingElement.MaxBufferSize = int.MaxValue;
                httpBindingElement.MaxReceivedMessageSize = int.MaxValue;
                result.Elements.Add(httpBindingElement);
                return result;
            }
            throw new System.InvalidOperationException(string.Format("No se pudo encontrar un punto de conexión con el nombre \"{0}\".", endpointConfiguration));
        }
        
        private static System.ServiceModel.EndpointAddress GetEndpointAddress(EndpointConfiguration endpointConfiguration)
        {
            if ((endpointConfiguration == EndpointConfiguration.ServicioImpuestosSoap))
            {
                return new System.ServiceModel.EndpointAddress("http://localhost:65099/ServicioImpuestos.asmx");
            }
            if ((endpointConfiguration == EndpointConfiguration.ServicioImpuestosSoap12))
            {
                return new System.ServiceModel.EndpointAddress("http://localhost:65099/ServicioImpuestos.asmx");
            }
            throw new System.InvalidOperationException(string.Format("No se pudo encontrar un punto de conexión con el nombre \"{0}\".", endpointConfiguration));
        }
        
        public enum EndpointConfiguration
        {
            
            ServicioImpuestosSoap,
            
            ServicioImpuestosSoap12,
        }
    }
}