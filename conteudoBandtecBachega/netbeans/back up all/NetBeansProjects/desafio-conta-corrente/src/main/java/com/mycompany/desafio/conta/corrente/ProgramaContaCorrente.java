/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author digital
 */
public class ProgramaContaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("Raphael", 1500.00);
        ContaCorrente conta2 = new ContaCorrente("Chabega", 7000.00);
        
       conta1.depositar(1, 5, 2020, 1500.00);
       conta2.sacar(4, 12, 2022, 1500.00);
       
       
        
        
    }
}
