/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoartirmetico;

/**
 *
 * @author Carlos
 */
public class Juego {

    String[] preguntas;
    double[] respuestas;
    int numeroDePreguntas;
    int preguntaActual;
    int preguntasCorrectas;

    public Juego() {

        this.numeroDePreguntas = 10;
        this.preguntas = new String[10];
        this.respuestas = new double[10];
        this.preguntas[0] = "3+5=";
        this.preguntas[1] = "5*5=";
        this.preguntas[2] = "4*4=";
        this.preguntas[3] = "9+11=";
        this.preguntas[4] = "122*2=";
        this.preguntas[5] = "3+5=";
        this.preguntas[6] = "5*5=";
        this.preguntas[7] = "4*4=";
        this.preguntas[8] = "9+11=";
        this.preguntas[9] = "122*2=";
        this.respuestas[0] = 8;
        this.respuestas[1] = 25;
        this.respuestas[2] = 26;
        this.respuestas[3] = 20;
        this.respuestas[4] = 244;
        this.respuestas[5] = 8;
        this.respuestas[6] = 25;
        this.respuestas[7] = 26;
        this.respuestas[8] = 20;
        this.respuestas[9] = 244;

    }

    public int getNumeroDePreguntas() {
        return numeroDePreguntas;
    }

    public int getPreguntaActual() {
        return preguntaActual;
    }

    public int getPreguntasCorrectas() {
        return preguntasCorrectas;
    }

    public void iniciar() {
        this.preguntasCorrectas = 0;
        this.preguntaActual = 1;

    }

    public String getPregunta() {
        if (this.preguntaActual != this.numeroDePreguntas) {
            String pregunta = this.preguntas[this.preguntaActual - 1];
            this.preguntaActual++;
            return pregunta;
        }
        return "No xisten preguntas";
    }
    public String verificarRespuesta(int numeroDePregunta,double respuesta)
    {
        if(numeroDePregunta>this.numeroDePreguntas)
        {
            return "Numero de pregunta invalido";
        }
        if(respuesta==this.respuestas[numeroDePregunta-1])
        {
            this.preguntasCorrectas++;
            return "Respuesta correcta";
        }
        return "respuesta incorrecta";
    }
}
