
package com.mycompany.raphael.bachega.c3;

public class MedicoClinico extends Medico{
    
    private Integer consultas;
    private Double valorConsulta;

    public MedicoClinico(Integer consultas, Double valorConsulta, Integer codigo, String nome) {
        super(codigo, nome);
        this.consultas = consultas;
        this.valorConsulta = valorConsulta;
    }

    @Override
    public Double calculaSalario() {   
        return this.consultas * valorConsulta;
    }

    @Override
    public String toString() {
        return "\nMedico Clinico\n"+ 
                super.toString() + 
                "\nConsultas: " + consultas + 
                "\nValor da Consulta: " + valorConsulta + 
                "\nSalário: "+ calculaSalario();
    }

    public Integer getConsultas() {
        return consultas;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }
    
    
    
}
