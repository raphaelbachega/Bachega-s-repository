/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raphael.bachega.ultima.prova;

/**
 *
 * @author digital
 */
public class Heroi extends Personagem{

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double total = 0.0;
        for (SuperPoder poder : poderes) {
            total += poder.getCategoria();
        }
        return total + (total*0.05);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
