
package com.mycompany.raphael.bachega.c3;

public class Instrutor {
    
    protected String nome;
    protected Integer qtdHora;
    protected Double valorHora;

    public Instrutor(String nome, Integer qtdHora, Double valorHora) {
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }
    
    public Double calcularSalario(){
        return ((this.qtdHora * this.valorHora)*4.5);
    }

    @Override
    public String toString() {
        return "Instrutor{" + "nome=" + nome + 
                ", qtdHora=" + qtdHora + ", valorHora=" + valorHora + ", Salário: " + calcularSalario() + '}';
    }
    
    
}
