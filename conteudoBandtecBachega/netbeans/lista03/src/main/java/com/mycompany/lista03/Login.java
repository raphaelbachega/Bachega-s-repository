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
public class Login {
    public static void main(String[] args) {
        String usuario, senha;
        Integer cont;
        cont=0;
        do{
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema!\n"
                + "Digite seu nome de usuário:");
        usuario = leitor.next();
        System.out.println("Agora digite sua senha:");
        senha = leitor.next();
        cont++;
            if(!usuario.equals("admin") && !senha.equals("#Bandtec")){
            System.out.println("Login e/ou senha inválidos.");
            }
        }while(!usuario.equals("admin") && !senha.equals("#Bandtec"));
        
           if(usuario.equals("admin") && senha.equals("#Bandtec")){
            System.out.println("Login realizado com sucesso!");
           }
    }
}    
            
        
    

