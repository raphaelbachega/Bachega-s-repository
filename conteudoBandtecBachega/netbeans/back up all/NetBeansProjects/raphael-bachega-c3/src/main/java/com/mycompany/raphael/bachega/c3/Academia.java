
package com.mycompany.raphael.bachega.c3;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    
    protected String nome;
    protected Integer vagas;
    protected List<Instrutor> instrutores;

    public Academia(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        instrutores = new ArrayList<>();
    }
    

    public void contratarInstrutor(Instrutor instrutor){
        if (instrutores.size() < vagas) {
            instrutores.add(instrutor);
        }
        else{
            System.out.println(String.format("A academia %s não possui vagas disponíveis", nome));
        }
    }
    
    public void exbirInstrutores(){
        if(!instrutores.isEmpty()){
            for (Instrutor i : instrutores) {
                System.out.println(i);
            }
        }
        else{
            System.out.println(String.format("A academia %s não possuí instrutores", nome));
        }
    }
    

    @Override
    public String toString() {
        return "Academia{" + "nome=" + nome + ", vagas=" + vagas + ", instrutores=" + instrutores + '}';
    }
   
    
    
}