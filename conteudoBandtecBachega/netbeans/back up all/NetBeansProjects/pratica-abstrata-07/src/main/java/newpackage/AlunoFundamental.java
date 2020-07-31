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
public class AlunoFundamental extends Aluno{
    
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    public AlunoFundamental(Double nota1, Double nota2, Double nota3, Double nota4, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public Double calculaMedia() {
       return (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{"+ super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + " Média: " + calculaMedia() +'}';
    }

    
    
    
    
}
