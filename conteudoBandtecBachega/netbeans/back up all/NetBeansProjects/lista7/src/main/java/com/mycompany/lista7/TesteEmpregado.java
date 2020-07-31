/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista7;

/**
 *
 * @author digital
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado funcionario1 = new Empregado(5.400,"analista de sistemas","joao");
        
        funcionario1.reajustarSalario(0.15);
        funcionario1.exibirDados();
        
        Empregado funcionario2 = new Empregado(3.000,"Estagiario","Marcthelo");
        
        funcionario2.reajustarSalario(1.0);
        funcionario2.exibirDados();
        
    }
}
