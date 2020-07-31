/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista06;

import java.util.Scanner;


/**
 *
 * @author digital
 */
public class CaulculadoraConsole {
    
    public static void main(String[] args) {
        Calculo calculadora = new Calculo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero da operação:");
        Double numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo numero da operação:");
        Double numero2 = leitor.nextDouble();
        
        calculadora.soma(numero1, numero2);
        System.out.println(String.format("%.2f + %.2f = " + calculadora.getResultado(), numero1,numero2));
        
        calculadora.subtracao(numero1, numero2);
        System.out.println(String.format("%.2f - %.2f = " + calculadora.getResultado(), numero1,numero2));
        
        calculadora.multiplicacao(numero1, numero2);
        System.out.println(String.format("%.2f x %.2f = " + calculadora.getResultado(), numero1,numero2));
        
        calculadora.divisao(numero1, numero2);
        System.out.println(String.format("%.2f / %.2f = " + calculadora.getResultado(), numero1,numero2));

    }
}
