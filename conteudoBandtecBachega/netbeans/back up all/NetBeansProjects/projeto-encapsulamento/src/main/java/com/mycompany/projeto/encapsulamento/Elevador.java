/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

/**
 *
 * @author digital
 */
public class Elevador {
    Integer peso = 0,cont = 0;
    
    
    void entrarHomen(){
        peso += 90;
        cont ++;
    }
    void entrarMulher(){
        peso += 65;
        cont ++;
    }
    void entrarCrianca(){
        peso += 40;
        cont ++;
    }
}
