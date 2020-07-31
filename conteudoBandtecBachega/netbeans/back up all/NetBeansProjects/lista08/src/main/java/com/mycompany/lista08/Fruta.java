/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digital
 */
public class Fruta {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        List<String> frutas = new ArrayList<>();
        frutas.add("laranja");
        frutas.add("limao");
        frutas.add("pessego");
        
        do{ System.out.println("Digita e fruta:");
        String frutaDigitada = leitor.nextLine();
        
        
        if(frutas.contains(frutaDigitada.toLowerCase())){
            System.out.println(String.format("Tem %s aqui!", frutaDigitada));
        }
        else{
            System.out.println(String.format("Não tem %s aqui!", frutaDigitada));
        }
        }while(true);
        
    }
}
