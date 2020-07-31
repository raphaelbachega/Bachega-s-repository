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
public class AlunoPos extends Aluno{

    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Double nota1, Double nota2, Double notaMonografia, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 + this.nota2 + this.notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunoPos{"+ super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + ", notaMonografia=" + notaMonografia + calculaMedia() +'}';
    }
    
    
    
    
}

