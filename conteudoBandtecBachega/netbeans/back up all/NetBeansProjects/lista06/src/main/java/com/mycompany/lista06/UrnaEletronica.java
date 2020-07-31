/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista06;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class UrnaEletronica {
    public static void main(String[] args) {
        Urna eletronica = new Urna();
        
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("As eleições começaram digite 1 para o candidato 1 e 2 para o candidato 2. \n"
                + " Para encerrar digite Qualquer outro valor.");
         
        Double numero;
        
        
        while (true) {
            System.out.println("Digite seu voto:");
            numero = leitor.nextDouble();
            
            if(numero == 1){
                eletronica.votar1();
                System.out.println("Candidato 1 recebeu 1 voto! Totalizando: " + eletronica.getVoto1().toString());
                System.out.println("Candidato 2 recebeu 0 voto! Totalizando: " + eletronica.getVoto2().toString());
                System.out.println("total de votos:" + eletronica.total.toString());
            }
            
            else if(numero == 2){
                eletronica.votar2();
                System.out.println("Candidato 1 recebeu 0 voto! Totalizando: " + eletronica.getVoto1().toString());
                System.out.println("Candidato 2 recebeu 1 voto! Totalizando: " + eletronica.getVoto2().toString());
                System.out.println("total de votos:" + eletronica.total.toString());
            }
            else{
                eletronica.frase();
                System.out.println(eletronica.texto);
                System.out.println("Votação encerrada!");
                break;
            }
            
        }
        
//        do {            
//            
//            
//            
//            else{
//                
//                
//            }
//            System.out.println("Candidato 1 recebeu 1 voto! Totalizando:" + eletronica.getVoto1().toString());
//            System.out.println("Candidato 2 recebeu 1 voto! Totalizando:" + eletronica.getVoto2().toString());
//            System.out.println("total de votos:" + eletronica.total.toString());
//            
//        } while (true); 
    }
    
    
}
