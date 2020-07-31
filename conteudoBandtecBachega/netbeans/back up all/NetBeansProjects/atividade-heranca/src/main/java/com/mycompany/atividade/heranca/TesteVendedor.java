/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.heranca;

/**
 *
 * @author digital
 */
public class TesteVendedor {
    public static void main(String[] args) {
        
        VendedorComissao vendedor1 = new VendedorComissao(777, "Mockey", 1000.00 , 0.10);
        VendedorComissaoMaisFixo v1 = new VendedorComissaoMaisFixo(3000.00,1234 , "jhonknee", 10000.00, 1000.00);
        
        
        vendedor1.getCodigo();
        vendedor1.getNome();
        vendedor1.getTaxa();
        vendedor1.getVendas();
        vendedor1.calculaSalario();
        
        v1.calculaSalario();
        v1.getSalarioFixo();
        
        System.out.println(vendedor1);
        System.out.println(v1);
        
       
    }
}
