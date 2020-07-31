/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class ContaCorrente {
    
    private String titular;
    private Double saldo;
    private List<Historico> list;


    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.list = new ArrayList<Historico>();
        
    }


    
   public void depositar(Integer dia, Integer mes, Integer ano, Double valor){
       this.saldo += valor;
       this.list.add(new Historico(dia, mes, ano, valor, "Depósito"));
       exibirExtrato();
   }
    
   public void sacar(Integer dia, Integer mes, Integer ano, Double valor){
       this.saldo -= valor;
       this.list.add(new Historico(dia, mes, ano, valor, "Saque"));
       exibirExtrato();
   }
    
   public void exibirExtrato(){
       
       System.out.println("====== Extrato ======\n\n" +
                          "Titular: "+ titular +"\n"+
                          "Saldo  : "+ saldo +"\n"+
                           list + 
                          "\n"+
                          "=====================");
       
   }
    
}
