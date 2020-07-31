/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.mysql;

/**
 *
 * @author digital
 */
public class TesteMetodos {
    
    private Integer numero = 1;
    private Integer numero1 = 1;
    private Integer total;
    
    
    public Integer conta(){
        return total = this.numero + this.numero1;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public Integer getTotal() {
        return total;
    }
    
    
}
