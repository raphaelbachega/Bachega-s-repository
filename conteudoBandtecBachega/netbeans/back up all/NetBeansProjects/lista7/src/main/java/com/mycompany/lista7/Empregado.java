/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista7;


public class Empregado {
     private Double salario;
     private String cargo, nome;

    public Empregado(Double salario, String cargo, String nome) {
        this.salario = salario;
        this.cargo = cargo;
        this.nome = nome;
    }

      Double reajustarSalario(Double percentual){
         salario += salario * percentual;
         return this.salario;
     }
     
     void exibirDados(){
         System.out.println("Nome: "+ nome);
         System.out.println("Cargo: "+ cargo);
         System.out.println(String.format("Salario: %.3f",salario));
         System.out.println("=============================");
     }
     
     
     
 
    
}
