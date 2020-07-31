package com.mycompany.atividade.heranca;

public class VendedorComissaoMaisFixo extends VendedorComissao{

    protected Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    
   
    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + salarioFixo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" + "salarioFixo=" + salarioFixo + '}';
    }

   
    
    
}
