/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author rapha
 */
public class Acumulador {
    public static void main(String[] args) {
        Integer num, sum=0, cont;
        
        Scanner leitor = new Scanner(System.in);
        
        
        
        while(true){
            System.out.println("Digite um número:");
            num = leitor.nextInt();
            if(num == 0){
                System.out.println("Sum: "+sum);
                break;
            }
            sum+=num;
            
        }
    }
}
