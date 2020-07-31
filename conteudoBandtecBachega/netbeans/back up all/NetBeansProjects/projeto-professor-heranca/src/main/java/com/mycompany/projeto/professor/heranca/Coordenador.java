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
public class Coordenador extends Professor{
    
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer qtdHorasCoord, Double valorHoraCoord, String curso, String nome, Integer codigo, Integer horas, Double valorHora) {
        super(nome, codigo, horas, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }
    
//    public Double calculaSalario(){
//        return ((this.qtdHorasCoord * valorHoraCoord)*4.5) + ((getHoras() * getValorHora())*4.5);
//    }

    @Override
    public Double calculaSalario() {
        return super.calculaSalario()+(this.qtdHorasCoord * valorHoraCoord)*4.5; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return super.toString() + "Coordenador{" + "qtdHorasCoord=" + qtdHorasCoord + ", valorHoraCoord=" + valorHoraCoord + ", curso=" + curso + '}';
    }
    
    

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }
    
    
    
}
