/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica.abstrata;

/**
 *
 * @author digital
 */
public class Quadrado extends Figura{
    
    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado{"+ super.toString() + "lado=" + lado + " area: "+ calculaArea() + '}';
    }

    
    
    

    
    
    
}
