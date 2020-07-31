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
public class Retangulo extends Figura{
    
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + super.toString() +"base=" + base + ", altura=" + altura +" area: "+ calculaArea() + '}';
    }

    
    
    
    
}
