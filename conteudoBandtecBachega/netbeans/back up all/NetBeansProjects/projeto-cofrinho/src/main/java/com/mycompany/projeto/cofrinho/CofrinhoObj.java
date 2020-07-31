/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.cofrinho;

/**
 *
 * @author digital
 */
public class CofrinhoObj {
    
    
    Double saldo = 0.0;
    
    void sacar(){
        if((saldo - 50)>= 0){
            saldo -= 50;
        }
    }
    void depositar(){
        saldo += 50;
    }
    void quebrarCofrinho(){
        saldo = 0.0;
    }
    
    
}
