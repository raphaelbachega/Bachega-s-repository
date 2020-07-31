/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bachega.ac1;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class Economista {
    public static void main(String[] args) {
        Double deposito, totalDinheiro = 0.0;
        String nome;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = leitor.nextLine();
        
        for(Integer cont = 1; cont < 8; cont++){
            System.out.print("Qual o valor depositado? R: ");
            deposito = leitor.nextDouble(); 
            
            
            if(cont == 7 && deposito == 0.01 ||
                    cont == 7 && deposito == 0.05 ||
                    cont == 7 && deposito == 0.10 ||
                    cont == 7 && deposito == 0.25 ||
                    cont == 7 && deposito == 0.50 ||
                    cont == 7 && deposito == 1.0)
            {
                totalDinheiro += deposito;
                System.out.println(String.format("Valor depositado no %dº dia \n", cont));
                System.out.println(String.format("Ao final de %d dias, %s guardou R$ %.2f", cont, nome, totalDinheiro));
            }
            else if(deposito == 0.01 || deposito == 0.05 || deposito == 0.10 || deposito == 0.25 || deposito == 0.50 || deposito == 1.0){
                
                 totalDinheiro += deposito;
                System.out.println(String.format("Valor depositado no %dº dia \n", cont));
                
            }
            
            else{
                System.out.println("Valor inválido!");
                cont--;
            }
            
        }
        
        
        
    }
}
