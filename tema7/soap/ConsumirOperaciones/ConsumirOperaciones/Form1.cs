using ServicioOperaciones;

namespace ConsumirOperaciones
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            int c=0;
            OperacionesSoapClient op = new();
            
            switch (cbOperacion.SelectedIndex)
            {
                case 0:

                    _ = op.sumarAsync(a,b);
                    break;
                case 1:
                    c = op.restarAsync(a, b);
                    break;
                case 2:
                    c = op.Multiplicar(a, b);
                    break;

                case 3:
                    c = op.Dividir(a, b);
                    break;
            }
            lblResultado.Text = c.ToString();
           

        }
    }
}