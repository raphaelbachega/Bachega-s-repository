/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digital
 */
public class TesteInteiros {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        
        Integer numero = 1;
        
        do {        
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();
            
            if(numero != 0){
                lista.add(numero);
            }
            
            
        } while (numero != 0);
        
        System.out.println(lista);
        
        //1
        System.out.println("Todos os pares");
        for(Integer numeroRodada : lista){
            
            if(numeroRodada % 2 == 0){
                System.out.println(numeroRodada);
            }
        }
        
        //2
        System.out.println("Todos os impares");
        for(Integer numeroRodada : lista){
            
            if(numeroRodada % 2 != 0){
                System.out.println(numeroRodada);
            }
        }
        
        
        System.out.println("soma de todas as rodadas");
        Integer soma = 0;
        for(Integer numeroRodada : lista){
         soma += numeroRodada;
           
        } System.out.println(String.format("A soma é: %d",soma));
        
        
        Integer maior = Integer.MAX_VALUE;
        
        System.out.println(maior);
        
        for(Integer numeroRodada : lista){
            
            if(numeroRodada < maior){
                maior = numeroRodada;
            }
            
        }
        System.out.println(String.format("o menor numero da lista é: ", maior));
        
    }
      
}
