package com.mycompany.exemplo.classe.abstrata;


public class Horista extends Funcionario{

    private Integer qtdHora;
    private Double valorHora;

    public Horista(Integer qtdHora, Double valorHora, String cpf, String nome) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" + super.toString() +"qtdHora=" + qtdHora + ", valorHora=" + valorHora + ", Salário: " +calcSalario() +'}';
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }
    
    
    
    
}
