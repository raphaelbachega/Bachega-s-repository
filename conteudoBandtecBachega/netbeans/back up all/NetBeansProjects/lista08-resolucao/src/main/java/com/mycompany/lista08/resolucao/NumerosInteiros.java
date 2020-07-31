/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista08.resolucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digital
 */
public class NumerosInteiros {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        
        Integer numero = 0;
        
        do {         
            System.out.println("Digite um número");
            numero = leitor.nextInt();
            
            if(numero != 0){
                lista.add(numero);
            }
            
        } while (numero != 0);
        
        System.out.println(lista);
        
        System.out.println("Todos os numeros pares: ");
        for(Integer par: lista){
            
            if(par % 2 == 0){
                System.out.println(par);
                
            }
        }
         System.out.println("Todos os numeros impares: ");
        for(Integer par: lista){
            
            if(par % 2 == 1){
                System.out.println(par);
                
            }
        }
        
        System.out.println("Soma de todos os numeros:");
        Integer somaNumero =0;
        for(Integer soma: lista){
            somaNumero += soma;
        }
        System.out.println(somaNumero);
        
        System.out.println("O menos numero da lista: ");
        
        Integer menor = Integer.MIN_VALUE;
    }
}
