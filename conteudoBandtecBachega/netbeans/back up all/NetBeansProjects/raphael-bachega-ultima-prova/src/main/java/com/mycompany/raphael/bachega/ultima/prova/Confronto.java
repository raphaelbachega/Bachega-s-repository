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
public class Confronto {
    
    public static void lutar(Heroi heroi, Vilao vilao){
        if (heroi.getForcaTotal() > vilao.getForcaTotal()) {
            System.out.println(String.format("\n\n\nConfronto entre %s e %s\n\n O vencedor é o herói %s .",heroi.codinome, vilao.codinome, heroi.codinome));
        }
        else if(heroi.getForcaTotal() < vilao.getForcaTotal()) {
             System.out.println(String.format("\n\n\nConfronto entre %s e %s\n\n O vencedor é o vilão %s .",heroi.codinome, vilao.codinome, vilao.codinome));
        }
        else{
            System.out.println(String.format("\n\n\nConfronto entre %s e %s\n\n Houve um empate ninguém venceu! Ainda...", heroi.codinome, vilao.codinome));
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
