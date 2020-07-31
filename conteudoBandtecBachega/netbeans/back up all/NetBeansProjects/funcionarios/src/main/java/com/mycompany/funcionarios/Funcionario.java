/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funcionarios;

/**
 *
 * @author digital
 */
public class Funcionario {
   protected String nome;
   protected Integer idade;
   protected String cpf;
   protected Double salario;

    public Funcionario(String nome, Integer idade, String cpf, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    
    public void exibirDados(){
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Idade: %d", this.idade));
        System.out.println(String.format("cpf: %s", this.cpf));
        System.out.println(String.format("Salário: %.2f", this.salario));
    }
    
    public void reajustarSalario(){
        this.salario += this.salario*0.10;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }
    
    
    
}
