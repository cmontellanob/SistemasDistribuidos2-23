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
public class Cuenta implements Serializable{
    Banco banco;
    int nroCuenta;
    Cliente cliente;
    Double saldo;

    public Cuenta(Banco banco, int nroCuenta, Cliente cliente, Double saldo) {
        this.banco = banco;
        this.nroCuenta = nroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
