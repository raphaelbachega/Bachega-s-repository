
package newpackage;

public class App {
    
    public static void main(String[] args) {
        AlunoFundamental f = new AlunoFundamental(8.0,7.0,6.0,9.0,"xunior", 1234543);
        AlunoGraduacao g = new AlunoGraduacao(7.0,8.5, "jaira", 54321);
        AlunoPos p = new AlunoPos(6.0, 6.0, 10.0, "topero", 7345746);
        
        Cadastro c = new Cadastro();
        
        c.adicionaAluno(f);
        c.adicionaAluno(g);
        c.adicionaAluno(p);
        
        c.exibeAlunosFundamental();
        c.exibeAlunosGraduacao();
        c.exibeAlunosPos();
    }
    
}
