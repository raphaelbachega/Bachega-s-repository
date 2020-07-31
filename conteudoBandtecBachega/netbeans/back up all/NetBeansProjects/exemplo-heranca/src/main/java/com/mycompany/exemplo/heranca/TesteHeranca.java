/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca;

/**
 *
 * @author digital
 */
public class TesteHeranca {
    
    public static void main(String[] args) {
        
        AlunoGraduacao a1 = new AlunoGraduacao(9.0, 7.0, 10000, "Raphael");
        
        System.out.println("O aluno "+ a1.getNome() + " tem nota continuada = "
                            + a1.getNotaContinuada());
        
    }
}
