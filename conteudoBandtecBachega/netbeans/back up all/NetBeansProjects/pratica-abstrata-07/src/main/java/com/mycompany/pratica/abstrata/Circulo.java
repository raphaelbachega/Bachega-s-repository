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
public class Circulo extends Figura{
    
    private Double raio;

    
    
    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + "raio=" + raio + " area: "+ calculaArea() + '}';
    }
    
    
    
}
