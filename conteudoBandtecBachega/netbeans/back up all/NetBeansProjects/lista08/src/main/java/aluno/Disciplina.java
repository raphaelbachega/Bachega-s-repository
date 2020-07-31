/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author digital
 */
public class Disciplina {
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;
    private Integer qtdFaltas;
    private Boolean aprovado;
    private Double media;

    public Disciplina(String nome, Double notaContinuada, Double notaSemestral, Integer qtdFaltas) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
        this.qtdFaltas = qtdFaltas;
        this.aprovado = this.isAprovado();
        this.media = 0.0;
    }

    public Boolean isAprovado(){
        
        
        return qtdFaltas <= 15 && media >= 6;
    }
    
    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public Integer getQtdFaltas() {
        return qtdFaltas;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + ", qtdFaltas=" + qtdFaltas + ", aprovado=" + aprovado + ", media=" + media + '}';
    }
    
    
    
   
}
