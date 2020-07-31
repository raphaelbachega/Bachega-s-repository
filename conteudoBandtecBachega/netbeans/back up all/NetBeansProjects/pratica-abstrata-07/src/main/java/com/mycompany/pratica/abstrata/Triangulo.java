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
public class Triangulo extends Figura{
    
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return (this.base * this.altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() + "base=" + base + ", altura=" + altura +" area: "+ calculaArea() + '}';
    }

 
    
    
    
}
