using Operaciones;

namespace ConsumirOperaciones
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            int op=cbOperaciones.SelectedIndex;
            int c = 0;
            OperacionesSoapClient cliente = new OperacionesSoapClient(new OperacionesSoapClient.EndpointConfiguration());
            switch (op)
            {
                case 0:
                    c = cliente.sumar(a, b);
                    break;
                    case 1:
                    c = cliente.restar(a, b);
                    break;
                case 2:
                    c = cliente.multiplicar(a, b);
                    break;
                case 3:
                    c = cliente.dividir(a, b);
                    break;


            }
            lblResultado.Text = c.ToString();

        }
    }
}