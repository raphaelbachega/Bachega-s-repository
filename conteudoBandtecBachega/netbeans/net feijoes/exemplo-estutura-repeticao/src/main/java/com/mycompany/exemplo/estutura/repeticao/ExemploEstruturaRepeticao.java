/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.estutura.repeticao;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class ExemploEstruturaRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        
        
        Integer cont = 1;
        while (cont <= 6){
            System.out.println("Boa noite!cont="+cont);
            cont ++;
        }
        System.out.println("cont="+ cont);
        
        for(Integer i =1; i <= 6; i=i+2){
            System.out.println("i="+i);
        }
        
        cont = 5;
        do{
            System.out.println("cont="+ cont);
            cont --;
        }while (cont >= 0);
        do {
            System.out.println("Digite um valor positivo");
            numero = leitor.nextInt();
        }while (numero < 0);
    }
}
