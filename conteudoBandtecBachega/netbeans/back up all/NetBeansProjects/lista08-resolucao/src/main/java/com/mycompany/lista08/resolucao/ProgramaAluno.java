/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista08.resolucao;

/**
 *
 * @author digital
 */
public class ProgramaAluno {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(12345, "Bachegonios");
        a1.adiciona("LP", 9.0, 6.0, 14);   
        a1.adiciona("Banco de dados", 5.0, 5.5, 16);
        a1.exibirBoletim();
    }
    
}
