
package com.mycompany.raphael.bachega.c3;

public abstract class Medico {
    
    private Integer codigo;
    private String nome;

    public Medico(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public abstract Double calculaSalario();

    @Override
    public String toString() {
        return "Medico:" + 
                "\nCódigo: " + codigo + 
                "\nNome: " + nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    
}
