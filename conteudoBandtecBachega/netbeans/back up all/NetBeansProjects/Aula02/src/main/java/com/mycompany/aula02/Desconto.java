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
public class Desconto {
    public static void main(String[] args) {
        
        Double valor, desc5, desc10, desc20, desc50;
        Integer desc;
        
        System.out.println("Qual o valor do produto do produto?");
        Scanner leitor = new Scanner(System.in);
        valor = leitor.nextDouble();
        System.out.println("Digite o código de desconto:");
        desc = leitor.nextInt();
        
        desc5 = valor-(valor*0.05);
        desc10 = valor-(valor*0.1);
        desc20 = valor-(valor*0.2);
        desc50 = valor-(valor*0.5);
        
        switch (desc){
            case 1:
                System.out.println(String.format("Seu produto que custa %s , passa a custar %s",valor,desc5));
                break;
            case 2:
                System.out.println(String.format("Seu produto que custa %s , passa a custar %s",valor,desc10));
                break;
            case 3:
                System.out.println(String.format("Seu produto que custa %s , passa a custar %s",valor,desc20));
                break;
            case 4:
                System.out.println(String.format("Seu produto que custa %s , passa a custar %s",valor,desc50));
                break;
        }
        
    }
}
