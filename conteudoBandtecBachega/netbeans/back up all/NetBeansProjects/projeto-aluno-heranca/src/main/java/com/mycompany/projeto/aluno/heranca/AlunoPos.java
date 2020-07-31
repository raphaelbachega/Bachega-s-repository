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
public class AlunoPos extends Aluno{
    
    Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return (super.calculaMedia() + notaMonografia)/3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "AlunoPos{" + "notaMonografia=" + getNotaMonografia() + '}';
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    
    
    
    
    
}
