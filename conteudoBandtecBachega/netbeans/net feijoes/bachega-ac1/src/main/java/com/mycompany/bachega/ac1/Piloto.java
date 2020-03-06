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
public class Piloto {
    public static void main(String[] args) {
        Integer horas, cont, total=0;
        String nome;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome piloto?");
        nome = leitor.next();
        
        cont = 0;
        
        while(true){
            System.out.println("De quantas horas foi seu último vôo?");
            horas = leitor.nextInt();
            if(horas == 0){
                System.out.println("Quantidade inválida! Não será registrada!");
            }
            else if(horas > 6){
                System.out.println("Quantidade inválida! Não será registrada!");
            }
            else if(horas < 0){
                System.out.println(nome+" se aposentou após fazer "+cont+" vôos e "+total+" horas!");
                break;
            }
            else{
                total += horas;
                cont++;
                System.out.println(nome+" agora tem um total de "+total+" horas de vôo.");
            }
           
                      
        }
          
    }
}
