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
public class Tabuada {
    public static void main(String[] args) {
        Integer num, mult;
        
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        num = leitor.nextInt();
        
        Integer cont = 0;
        for(mult = num;cont <= 10; cont ++){
            System.out.println(+num+"x"+cont+ "=" +(num*cont));
        }
    }
}
