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
public class IndiceMassaCorporal {
    public static void main(String[] args) {
        
        Double peso, altura, imc;
        Integer sexo;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu peso:");
        peso = leitor.nextDouble();
        
        System.out.println("Digite sua altura:");
        altura = leitor.nextDouble();
        
        Scanner leitorSexo = new Scanner(System.in);
        
        System.out.println("Digite seu sexo:"
                            + "\n 1 homen"
                            + "\n 2 mulher");
        sexo = leitorSexo.nextInt();
        
        imc = peso/(altura*altura) ;
        
        
        switch (sexo){
            case 1:
                System.out.println(String.format("Homen e seu imc é %s ",imc));
                
        }
        
        
        
    }
}
