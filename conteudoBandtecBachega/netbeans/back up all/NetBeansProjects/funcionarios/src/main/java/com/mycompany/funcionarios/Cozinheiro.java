
package com.mycompany.funcionarios;


public class Cozinheiro extends Funcionario{
    
    private String especialidade;

    public Cozinheiro(String especialidade, String nome, Integer idade, String cpf, Double salario) {
        super(nome, idade, cpf, salario);
        this.especialidade = especialidade;
    }
    
    public void cozinhar(){
        System.out.println("Cozinhando");
    }
    
}
