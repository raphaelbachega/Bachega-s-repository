/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.aluno.heranca;

/**
 *
 * @author digital
 */
public class ProgramaAlunoHeranca {
 
    public static void main(String[] args) {
        
       
       
        Aluno a1 = new Aluno(4321, "Biruliru", 7.5, 8.2);
        Aluno a2 = new Aluno(4322, "profeta midinho", 7.5, 8.2);
        
        AlunoPos ap1 = new AlunoPos(7.0, 5511, "chabeguinha", 7.2, 8.0);
        
        System.out.println(String.format("O aluno %s tem média %.2f", a1.getNome(), a1.calculaMedia()));
        System.out.println(a1);
        
        System.out.println(String.format("O aluno %s tem média %.2f", a2.getNome(), a2.calculaMedia()));
        System.out.println(a2);
        
        System.out.println(String.format("O aluno de pós graduação %s tem média %.2f", ap1.getNome(), ap1.calculaMedia()));
        System.out.println(ap1);
        
        Faculdade f1 = new Faculdade("BandTec", 10);
        
        f1.matricularAluno(a1);
        f1.exibirAlunosMatriculados();
        System.out.println(f1);
    }

}
