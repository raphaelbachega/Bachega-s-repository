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
public class Loteria {
    public static void main(String[] args) {
        Integer num,cont,sort;
        
        Random aleatorio = new Random();
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 10:");
        num = leitor.nextInt();
          cont = 1;
        do{
        sort = aleatorio.nextInt(11);
      
        cont ++;
            System.out.println(sort); 
        }while(!sort.equals(num));          
            
        
        if(cont <= 3 ){
            System.out.println("Você é muito sortudo! \n"
                    + "foi na "+cont+" tentativa!");           
        }
        else if(cont <11){
            System.out.println("Você é sortudo! \n"
                    + "foi na "+cont+" tentativa!");
        }
        else{
            System.out.println("É melhor você ser trabalhador \n"
                                + "foi na "+cont+" tentativa!");
        }
  
    }
}
