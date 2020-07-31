/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raphael.bachega.ultima.prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public abstract class Personagem {
    
    String codinome;
    String nome;
    List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        poderes = new ArrayList();
    }
    
    public void adicionaPoder(String nome, Integer categoria){
        poderes.add(new SuperPoder(nome, categoria));
    }
    
    public abstract Double getForcaTotal();

    @Override
    public String toString() {
        return "Personagem{" + super.toString() + "codinome=" + codinome + ", nome=" + nome + ", poderes=" + poderes + '}';
    }
    
    
    
}
