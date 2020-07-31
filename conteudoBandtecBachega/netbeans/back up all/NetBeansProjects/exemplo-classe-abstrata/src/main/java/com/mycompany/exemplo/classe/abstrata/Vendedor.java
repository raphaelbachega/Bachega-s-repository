/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.classe.abstrata;

/**
 *
 * @author digital
 */
public class Vendedor extends Funcionario{
    
    private Double vendas;
    private Double taxa;

    public Vendedor(Double vendas, Double taxa, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + ", vendas=" + vendas + ", taxa=" + taxa + calcSalario() + '}';
    }

    public Double getVendas() {
        return vendas;
    }

    public Double getTaxa() {
        return taxa;
    }
    
    
    
}
