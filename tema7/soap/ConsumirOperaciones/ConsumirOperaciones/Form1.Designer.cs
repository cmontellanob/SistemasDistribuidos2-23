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
            cbOperacion = new ComboBox();
            label3 = new Label();
            panel1 = new Panel();
            lblResultado = new Label();
            txtA = new TextBox();
            txtB = new TextBox();
            button2 = new Button();
            panel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(74, 32);
            label1.Name = "label1";
            label1.Size = new Size(15, 15);
            label1.TabIndex = 0;
            label1.Text = "A";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(74, 93);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 1;
            label2.Text = "B";
            // 
            // cbOperacion
            // 
            cbOperacion.FormattingEnabled = true;
            cbOperacion.Items.AddRange(new object[] { "Sumar", "Restar", "Multiplicar", "Dividir" });
            cbOperacion.Location = new Point(147, 134);
            cbOperacion.Name = "cbOperacion";
            cbOperacion.Size = new Size(121, 23);
            cbOperacion.TabIndex = 4;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(74, 137);
            label3.Name = "label3";
            label3.Size = new Size(62, 15);
            label3.TabIndex = 5;
            label3.Text = "Operacion";
            // 
            // panel1
            // 
            panel1.BackColor = SystemColors.ActiveCaption;
            panel1.Controls.Add(lblResultado);
            panel1.Location = new Point(74, 240);
            panel1.Name = "panel1";
            panel1.Size = new Size(395, 96);
            panel1.TabIndex = 6;
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Location = new Point(144, 40);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(15, 15);
            lblResultado.TabIndex = 0;
            lblResultado.Text = "()";
            // 
            // txtA
            // 
            txtA.Location = new Point(133, 32);
            txtA.Name = "txtA";
            txtA.Size = new Size(100, 23);
            txtA.TabIndex = 7;
            // 
            // txtB
            // 
            txtB.Location = new Point(133, 88);
            txtB.Name = "txtB";
            txtB.Size = new Size(100, 23);
            txtB.TabIndex = 8;
            // 
            // button2
            // 
            button2.Location = new Point(193, 188);
            button2.Name = "button2";
            button2.Size = new Size(75, 23);
            button2.TabIndex = 9;
            button2.Text = "Calcular";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button2);
            Controls.Add(txtB);
            Controls.Add(txtA);
            Controls.Add(panel1);
            Controls.Add(label3);
            Controls.Add(cbOperacion);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private ComboBox cbOperacion;
        private Label label3;
        private Panel panel1;
        private Label lblResultado;
        private TextBox txtA;
        private TextBox txtB;
        private Button button2;
    }
}