/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.tarea1.app.objetos;

/**
 *
 * @author Miriam
 */
public class Operacion {
    private double numero1;
    private double numero2;
    private String signoOperacion;
    private double resultado;

    public Operacion(double numero1, double numero2, String signoOperacion, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.signoOperacion = signoOperacion;
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getSignoOperacion() {
        return signoOperacion;
    }

    public void setSignoOperacion(String signoOperacion) {
        this.signoOperacion = signoOperacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", signoOperacion=" + signoOperacion + ", resultado=" + resultado + '}';
    }
    
}