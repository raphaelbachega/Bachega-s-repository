/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author digital
 */
public class Historico {
    
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double valor;
    private String operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "Historico\n " + "\n dia= " + dia + ",\n mes= " + mes + ",\n ano= " + ano + ",\n valor= " + valor + ",\n operacao= " + operacao + '.';
    }
    
    
    
}
