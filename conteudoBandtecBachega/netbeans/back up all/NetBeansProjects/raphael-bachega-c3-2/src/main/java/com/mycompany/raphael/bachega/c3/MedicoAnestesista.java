
package com.mycompany.raphael.bachega.c3;

public class MedicoAnestesista extends Medico {
    
    private Integer anestesias;
    private Double valorAnestesia;

    public MedicoAnestesista(Integer anestesias, Double valorAnestesia, Integer codigo, String nome) {
        super(codigo, nome);
        this.anestesias = anestesias;
        this.valorAnestesia = valorAnestesia;
    }

    @Override
    public Double calculaSalario() {
        return this.anestesias * this.valorAnestesia;
    }

    @Override
    public String toString() {
        return "\nMédico Anestesista\n"+
                super.toString() + 
                "\nAnestesias: " + anestesias + 
                "\nValor da Anestesia: " + valorAnestesia + 
                "\nSalário: " + calculaSalario();
    }

    public Integer getAnestesias() {
        return anestesias;
    }

    public Double getValorAnestesia() {
        return valorAnestesia;
    }
    
    
}
