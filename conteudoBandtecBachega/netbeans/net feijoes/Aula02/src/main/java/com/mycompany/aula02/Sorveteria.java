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
public class Sorveteria {
    public static void main(String[] args) {
        Integer sov;
        
        System.out.println("Selecione o tipo de produto que você deseja"
                            + "\n1º casquinha"
                            + "\n2º Sundae"
                            + "\n3º Milk Shake");
        Scanner leitor = new Scanner(System.in);
        sov = leitor.nextInt();
        
        switch (sov){
            case 1:
                System.out.println("Casquinha R$2");
                break;
            case 2:
                System.out.println("Sundae R$5");
                break;
            case 3:
                System.out.println("Milk Shake R$7");
                break;
            
        }
        
    }
}
