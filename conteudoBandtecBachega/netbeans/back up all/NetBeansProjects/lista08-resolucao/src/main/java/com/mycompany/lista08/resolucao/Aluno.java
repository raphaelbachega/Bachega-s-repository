/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista08.resolucao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class Aluno {
    
    private Integer ra;
    private String nome;
    public List<Disciplina> list;
    
    public Aluno(Integer ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.list = new ArrayList<Disciplina>();
        
    }
    
    public void exibirBoletim(){
        
        System.out.println("======= Situação do aluno =======\n"
                         + "Nome do aluno: " + nome +
                           "\nRA: " + ra );
//         System.out.println(this.list.get(0).isAproved());
//         for (Integer i = 0; i < list.size(); i++) {
//            System.out.println("\nNome da Disciplina: " + this.list.get(i).getNome());
//            System.out.println("Nota Continuada: " + this.list.get(i).getNotaContinuada());
//            System.out.println("Quantidade Falta: " + this.list.get(i).getQuantFalta());
//
//            String status = "";
//            if (this.list.get(i).getAprovado() == true) {
//                status = "Aprovado!";
//            }else{
//                status = "Reprovado!";
//            }
//
//            System.out.println("Status: " + status);
//            System.out.println("Média: " + this.list.get(i).getMedia()));
//        }


        for(Disciplina d: list){
            String status = "";
            if(d.isAproved()== true){
                status = "Aprovado";
            }
            else{
                status = "Reprovado";
            }
            
        System.out.println("\nNome da disciplina: "+ d.getNome()+"\n"+
                           "Nota continuada: "+ d.getNotaContinuada()+"\n"+
                           "Quantidade de faltas: "+ d.getQuantFalta()+"\n"+
                           "Média final: "+ String.format("%.2f",d.getMedia())+"\n"+
                           "Situação: "+ status +"");
        }
        System.out.println("======= Situação aluno =======");
        
    }
    
    public void adiciona(String nome, Double notaContinuada, Double notaSemestral, Integer quantFalta){
        this.list.add(new Disciplina(nome, notaContinuada, notaSemestral, quantFalta));
        
    }

}
