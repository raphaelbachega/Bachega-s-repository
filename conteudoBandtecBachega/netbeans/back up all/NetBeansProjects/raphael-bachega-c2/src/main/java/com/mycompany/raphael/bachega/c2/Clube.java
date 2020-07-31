/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raphael.bachega.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class Clube {
    
    private String nome;
    private Double caixa;
    private List<Jogador> listaDeJogadores;

    public Clube(String nome, Double caixa) {
        this.nome = nome;
        this.caixa = caixa;
        listaDeJogadores = new ArrayList<Jogador>();
    }
    
    public void contratarJogador(Jogador jogador){
            if(caixa >= jogador.getValorDoPasse()){
            this.listaDeJogadores.add(jogador);
            caixa -= jogador.getValorDoPasse();
            }
            else{
                System.out.println(String.format("Fundos insuficientes para contratar o jogador %s", jogador.getNome()));
            }
    }
    public void exibeJogadores(){
        for(Jogador jogador: listaDeJogadores){
            if(listaDeJogadores.contains(jogador)){
                System.out.println(jogador);
                System.out.println("\nJogadores Obtidos:");
                jogador.exibeDados();
            }
            else{
                System.out.println("Você não contratou nenhum jogador ainda.");
            }  
        }
    }
    public void exibeCaixa(){
        System.out.println(String.format("Saldo disponível: R$%.2f", caixa));
    }
    
    
}



