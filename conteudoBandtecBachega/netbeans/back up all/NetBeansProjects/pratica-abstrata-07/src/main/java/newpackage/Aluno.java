/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author digital
 */
public abstract class Aluno {
    
    private String nome;
    private Integer ra;

    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }

    
    
    
    }
    

