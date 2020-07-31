/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

import java.util.Random;

/**
 *
 * @author digital
 */
public class Dado {
    private Integer aleatorio1 = 0;
    private Integer aleatorio = 0;
    Integer pontoDado1 = 0, pontoDado2 = 0;
    String text, textGanhador;
    
    Random sortear = new Random();
    Random sortear1 = new Random();

    public Integer getAleatorio1() {
        return aleatorio1;
    }
    
    public Integer getAleatorio() {
        return aleatorio;
    }
    
    void sorteio(){
        aleatorio = sortear.nextInt(6)+1;
        
    }
    
    void sorteio1(){
        aleatorio1 = sortear1.nextInt(6)+1;
        
    }
    
    void textear(){
        if(aleatorio > aleatorio1){
           text = "O dadinho 1 venceu!";
        }
        else if(aleatorio < aleatorio1){
            text = "O dadinho 2 venceu!";
        }
        else{
            text = "Empate!";
        }
    }
    void pontos(){
        if(aleatorio > aleatorio1){
            pontoDado1 +=1;
        }
        else if(aleatorio < aleatorio1){
            pontoDado2 +=1;
        }
        else{
            
        }
        textGanhador = ("Vitórias do dadinho 1: "+ pontoDado1 +" / Vitórias do dadinho 2:" + pontoDado2);
    }
}
