/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;



import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rapha
 */
public class Sorteio {
    public static void main(String[] args) {
        Integer num, i,aleatorio,par,impar;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 100:");
        num = leitor.nextInt();
        
        Random sort = new Random();
        
        par = 0;
        impar = 0;
        for(i = 1; i <200; i++){
              aleatorio = sort.nextInt(101);
              
              if(num.equals(aleatorio)) {
                  System.out.println("o numero "+ num +" foi sorteado na "+i+" vez.");
              }
              if(aleatorio %2==0){
                  par++;
              }
              else{
                  impar++;
              }
        }
        System.out.println("A quantidade de numeros pares sorteados foi de "+par);
        System.out.println("A quantidade de numeros iumpares sorteados foi de "+impar);
        System.out.println(i); 
      
    }
}
