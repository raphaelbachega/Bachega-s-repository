/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author digital
 */
public class Votacao {
    public static void main(String[] args) {
        Integer voto,mussarela=0,calabresa=0,queijos=0;
        
        
        
        System.out.println("Vote no seu sabor de pizza favorito!\n"
                + "para votar em mussarela digite 5.\n"
                + "para votar em calabresa 25.\n"
                + "para votar em quatro queijos digite 50.");
        
        Scanner leitor = new Scanner(System.in);
        for(int cont = 0;cont <=10; cont++){
            System.out.println("Digite seu "+cont+"º voto:");
            voto = leitor.nextInt();
        switch (voto) {
            case 5:
                mussarela++;
                break;
            case 25:
                calabresa++;
                break;
            case 50:
                queijos++;
                break;
            default:
                break;
        }
        
       }
        System.out.println("O sabor mussarela teve um total de: "+ mussarela +" votos.\n"
                + "O sabor de calabresa teve um total de: "+ calabresa +" votos.\n"
                        + "O sabor de Quatro queijos teve um total de: "+ queijos +" votos.");
        if(mussarela > calabresa && mussarela > queijos){
            System.out.println("Mussarela ganhou em votos!");
        }
        else if(calabresa > mussarela && calabresa> queijos){
            System.out.println("Calabresa ganhou em votos!");
        }
        else{
            System.out.println("Quatro queijos ganhou em votos!");
        }
     
}
}