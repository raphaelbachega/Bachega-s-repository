/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raphael.bachega.c2;

/**
 *
 * @author digital
 */
public class Jogador {
    
    private String nome;
    private Integer idade;
    private String posicao;
    private Double valorDoPasse;

    public Jogador(String nome, Integer idade, String posicao, Double valorDoPasse) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.valorDoPasse = valorDoPasse;
    }

  
    
    public void exibeDados(){
        System.out.println("======= Dados do jogador =======\n"+
                           "Nome do jogador: "+ nome +
                           "\nIdade: "+ idade +
                           "\nPosição: "+ posicao +
                           "\nValor do passe: "+ valorDoPasse);
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public Double getValorDoPasse() {
        return valorDoPasse;
    }


    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", idade=" + idade + ", posicao=" + posicao +
                ", valorDoPasse=" + valorDoPasse + '}';
    }
    
    
    
}
