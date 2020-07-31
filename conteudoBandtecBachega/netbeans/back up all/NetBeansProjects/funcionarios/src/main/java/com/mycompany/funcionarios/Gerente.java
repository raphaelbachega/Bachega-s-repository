
package com.mycompany.funcionarios;

public class Gerente extends Funcionario{
    
    private String departamento;

    public Gerente(String nome, Integer idade, String cpf, Double salario, String departamento) {
        super(nome, idade, cpf, salario);
        this.departamento = departamento;
    }
    
    public void exibirDados(){
        System.out.println(String.format("Responsável pelo departamento: %s", this.departamento));
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
}
