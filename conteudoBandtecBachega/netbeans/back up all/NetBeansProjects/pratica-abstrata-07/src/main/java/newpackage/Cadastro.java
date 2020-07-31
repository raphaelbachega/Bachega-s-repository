
package newpackage;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private List<Aluno> list = new ArrayList();
    
    public void adicionaAluno(Aluno a){
        list.add(a);
    }
    
    public void exibeAlunosFundamental(){
        if(!list.isEmpty()){
            for (Aluno aluno : list) {
                if(aluno instanceof AlunoFundamental){
                System.out.println(aluno);
                }
            }
        }
        else{
            System.out.println("nao tem aluno do fundamental");
        }
    }
    public void exibeAlunosGraduacao(){
        if(!list.isEmpty()){
            for (Aluno aluno : list) {
                if(aluno instanceof AlunoGraduacao){
                System.out.println(aluno);
                }
            }
        }
        else{
            System.out.println("nao tem aluno da graduacao");
        }
    }
    public void exibeAlunosPos(){
        if(!list.isEmpty()){
            for (Aluno aluno : list) {
                if(aluno instanceof AlunoPos){
                System.out.println(aluno);
                }
            }
        }
        else{
            System.out.println("nao tem aluno do pos");
        }
    }
    
}
