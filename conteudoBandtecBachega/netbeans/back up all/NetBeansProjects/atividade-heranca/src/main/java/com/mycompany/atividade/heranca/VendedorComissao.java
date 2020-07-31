
package com.mycompany.atividade.heranca;

public class VendedorComissao {
    
    protected Integer codigo;
    protected String nome;
    protected Double vendas;
    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
    
    public Double calculaSalario(){
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxa=" + taxa + calculaSalario() + '}';
    }
    
    
    
}
