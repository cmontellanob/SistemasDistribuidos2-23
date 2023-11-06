namespace ConsumirOperaciones
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            txtA = new TextBox();
            txtB = new TextBox();
            cbOperaciones = new ComboBox();
            button1 = new Button();
            pnlResultado = new Panel();
            lblResultado = new Label();
            pnlResultado.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(61, 50);
            label1.Name = "label1";
            label1.Size = new Size(15, 15);
            label1.TabIndex = 0;
            label1.Text = "A";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(59, 114);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 1;
            label2.Text = "B";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(59, 173);
            label3.Name = "label3";
            label3.Size = new Size(62, 15);
            label3.TabIndex = 2;
            label3.Text = "Operacion";
            // 
            // txtA
            // 
            txtA.Location = new Point(114, 42);
            txtA.Name = "txtA";
            txtA.Size = new Size(69, 23);
            txtA.TabIndex = 3;
            // 
            // txtB
            // 
            txtB.Location = new Point(114, 111);
            txtB.Name = "txtB";
            txtB.Size = new Size(69, 23);
            txtB.TabIndex = 4;
            // 
            // cbOperaciones
            // 
            cbOperaciones.FormattingEnabled = true;
            cbOperaciones.Items.AddRange(new object[] { "Sumar", "Restar", "Multiplicar", "Dividir" });
            cbOperaciones.Location = new Point(150, 171);
            cbOperaciones.Name = "cbOperaciones";
            cbOperaciones.Size = new Size(121, 23);
            cbOperaciones.TabIndex = 5;
            // 
            // button1
            // 
            button1.Location = new Point(143, 228);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 6;
            button1.Text = "Calcular";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // pnlResultado
            // 
            pnlResultado.Controls.Add(lblResultado);
            pnlResultado.Location = new Point(117, 287);
            pnlResultado.Name = "pnlResultado";
            pnlResultado.Size = new Size(219, 80);
            pnlResultado.TabIndex = 7;
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Location = new Point(55, 26);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(15, 15);
            lblResultado.TabIndex = 0;
            lblResultado.Text = "()";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(pnlResultado);
            Controls.Add(button1);
            Controls.Add(cbOperaciones);
            Controls.Add(txtB);
            Controls.Add(txtA);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            pnlResultado.ResumeLayout(false);
            pnlResultado.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox textBox1;
        private TextBox textBox2;
        private TextBox txtA;
        private TextBox txtB;
        private ComboBox cbOperaciones;
        private Button button1;
        private Panel pnlResultado;
        private Label lblResultado;
    }
}