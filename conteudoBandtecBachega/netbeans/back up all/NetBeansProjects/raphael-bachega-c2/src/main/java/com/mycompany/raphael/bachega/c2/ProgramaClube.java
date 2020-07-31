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
public class ProgramaClube {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Júnior", 28, "Lateral", 400000.00);
        Jogador j2 = new Jogador("Valdívia", 25, "Meio Campo", 500000.00);
        Jogador j3 = new Jogador("Bruxo", 18, "Lança", 600000.00);
        Jogador j4 = new Jogador("Valderrama", 41, "Zagueiro", 700000.00);
        Jogador j5 = new Jogador("Lewandowsky", 23, "Centro avante", 800000.00);
        
        Clube c1 = new Clube("Bananais", 1100000.00);
        c1.contratarJogador(j3);
        c1.contratarJogador(j1);
        c1.contratarJogador(j5);
        c1.exibeCaixa();
        c1.exibeJogadores();
        
        
       
    }
}
