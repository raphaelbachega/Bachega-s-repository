/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.professor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class Escola {
    
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Escola(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        professores = new ArrayList();
    }
    
    public void contratarProfessor(Professor p){
        if(professores.size() < vagas){
           professores.add(p);
        }
    }
    
    public void exibirProfessores(){
        
            
            System.out.println(professores);
            
       
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + ", vagas=" + vagas + ", professores=" + professores + '}';
    }
    
    
    
}
