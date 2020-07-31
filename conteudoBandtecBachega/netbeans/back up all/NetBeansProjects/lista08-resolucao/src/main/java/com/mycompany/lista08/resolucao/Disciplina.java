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
public class Disciplina {
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;
    private Integer quantFalta;
    private Boolean aprovado = this.aprovado;
    private Double media;

    public Disciplina(String nome, Double notaContinuada, Double notaSemestral, Integer quantFalta) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
        this.quantFalta = quantFalta;
    }
    

    public Boolean isAproved(){
        getMedia();
        return this.aprovado = quantFalta <= 15 && media >= 6; 
    }

    public String getNome() {
        return this.nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public Integer getQuantFalta() {
        return quantFalta;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public Double getMedia() {
        this.media = (notaContinuada * 0.4)+(notaSemestral * 0.6);
        return this.media;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", notaContinuada=" +
                notaContinuada + ", notaSemestral=" + notaSemestral +
                ", quantFalta=" + quantFalta + ", aprovado=" +
                aprovado + ", media=" + this.media + '}';
    }

    
    
}
