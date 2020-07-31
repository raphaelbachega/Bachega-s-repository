
package newpackage;

public class AlunoGraduacao extends Aluno{
    
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Double nota1, Double nota2, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1*0.4 + this.nota2*0.6);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{"+ super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + calculaMedia() +'}';
    }
    
    
    
    
    
}
