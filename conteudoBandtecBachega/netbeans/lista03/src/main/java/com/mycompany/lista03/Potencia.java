/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class Potencia {
    public static void main(String[] args) {
        Integer base, expoente, total;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da base:");
        base = leitor.nextInt();
        System.out.println("Digite o valor do expoente:");
        expoente = leitor.nextInt();
        
        total = 1;
        
        for(int cont = 1;cont <= expoente; cont++){
            total = total * base;
        }
        
        System.out.println("O resultado é: "+total);
    }
}
