/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.professor.heranca;

/**
 *
 * @author digital
 */
public class Professor {
    
    private String nome;
    private Integer codigo;
    private Integer horas;
    private Double valorHora;

    public Professor(String nome, Integer codigo, Integer horas, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.horas = horas;
        this.valorHora = valorHora;
    }

     
    public Double calculaSalario(){
        return (this.horas * valorHora) * 4.5; 
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", codigo=" + codigo + ", horas="
                + horas + ", valorHora=" + valorHora + " salario: "+ calculaSalario() +'}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    
    
}
