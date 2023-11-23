/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformaintercambio;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
class Cliente implements Serializable {
    int nrodocumento;
    String complemento;
    String nombres ;
    String primerApellido;
    String segundoapellido;

    public Cliente(int nrodocumento, String complemento, String nombres, String primerApellido, String segundoapellido) {
        this.nrodocumento = nrodocumento;
        this.complemento = complemento;
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.segundoapellido = segundoapellido;
    }

    public int getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(int nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }
    
}
