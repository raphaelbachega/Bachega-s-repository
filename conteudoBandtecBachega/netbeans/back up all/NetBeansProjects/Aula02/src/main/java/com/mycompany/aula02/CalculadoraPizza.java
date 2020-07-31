/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class CalculadoraPizza {
    public static void main(String[] args) {
        Double valor, maxi, total, maxtotal;
        String sabor;
        Integer rachar;
        
        
        System.out.println("Qual o valor da pizza?");
        Scanner leitor = new Scanner(System.in);
        valor = leitor.nextDouble();
        
        System.out.println("Qual o sabor da pizza?");
        Scanner leitorSabor = new Scanner(System.in);
        sabor = leitorSabor.nextLine();
        
        System.out.println("Quantas pessoas vão ''rachar'' a pizza");
        Scanner leitor1 = new Scanner(System.in);
        rachar = leitor1.nextInt();
        
        System.out.println("Qual o valor máximo que as pessoas aceitam ''rachar''?");
        Scanner leitor2 = new Scanner(System.in);
        maxi = leitor2.nextDouble();
        
        total = valor/rachar;
        maxi = (rachar* maxi);
        
        if(valor <= maxi){
            System.out.println(String.format("A pizza de sabor %s será dividida entre %s pessoas. R$ %s para cada.", sabor, rachar, total));
        }
        else{
            System.out.println(String.format("Deu ruim no racha a pizza deveria custar no máximo R$%s", maxi));
        }
        
    }
}
