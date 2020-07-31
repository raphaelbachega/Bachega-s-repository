/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.aluno.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class Faculdade {
    
    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        listaAlunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        if(listaAlunos.size() < vagas){
            listaAlunos.add(aluno);  

        }
    }
    public void exibirAlunosMatriculados(){
       
            if(!listaAlunos.isEmpty()){
                System.out.println(listaAlunos);
            }
            else{
                System.out.println(String.format("A faculdade %s não possui alunos cadastrados", nome));
            }
        
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", listaAlunos=" + listaAlunos + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

     
    
    
}
