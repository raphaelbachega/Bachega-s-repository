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
public class SuperPoder {
    
    String nome;
    Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "SuperPoder{" + "nome=" + nome + ", categoria=" + categoria + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getCategoria() {
        return categoria;
    }
    
    
}
