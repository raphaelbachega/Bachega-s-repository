/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

// descrição de um objeto / atributo
public class ContaCorrente {
    
    private Double saldo = 0.0;
    private Integer contador = 0;

    public Double getSaldo() {
        return saldo;
    }

    public Integer getContador() {
        return contador;
    }
    

//    public void setSaldo(Double saldo) {
//        this.saldo = saldo;
//    }
    void contar(){
        if(saldo > 0){
            contador ++;
        }     
    }
    
    void depositar50(){
        saldo += 50.00;
    }
    
    void sacar50(){
        if(saldo >= 50){
            saldo -= 50;
        }
    }    
}