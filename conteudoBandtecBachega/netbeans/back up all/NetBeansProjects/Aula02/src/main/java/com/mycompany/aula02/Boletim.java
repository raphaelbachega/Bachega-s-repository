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
public class Boletim {
    public static void main(String[] args) {
        Double nota1, nota2, nota3, media;
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = leitor.nextDouble();
        
        media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Sua média é " + media);
        
        if(media >= 5 || media <= 7){
            System.out.println("Você tem direito de fazer uma prova de recuperação.");
        }
        else if(media >7){
            System.out.println("Passou direto!");
        }
        else{
            System.out.println("Reprovado direto");
    }
    }
}
