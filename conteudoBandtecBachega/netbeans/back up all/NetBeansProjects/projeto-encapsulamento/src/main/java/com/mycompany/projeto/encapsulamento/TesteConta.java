
package com.mycompany.projeto.encapsulamento;


public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println("Depositando 50");
        conta1.depositar50();
        System.out.println("Saldo atual: "+ conta1.getSaldo());
        
        System.out.println("Sacar 50");
        conta1.sacar50();
        System.out.println("Saldo atual: "+ conta1.getSaldo());
        conta1.sacar50();
        
        
        System.out.println("Saldo final: "+ conta1.getSaldo());
        
    }
}
