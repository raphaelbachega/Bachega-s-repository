
package com.mycompany.raphael.bachega.c3;

public class Personal extends Instrutor{
    
    protected Integer qtdHoraPersonal;
    protected Double valorHoraPeronal;

    public Personal(Integer qtdHoraPersonal, Double valorHoraPeronal, String nome, Integer qtdHora, Double valorHora) {
        super(nome, qtdHora, valorHora);
        this.qtdHoraPersonal = qtdHoraPersonal;
        this.valorHoraPeronal = valorHoraPeronal;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ((qtdHoraPersonal * valorHoraPeronal )*4.5); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "Personal{" + "qtdHoraPersonal=" + qtdHoraPersonal +
                ", valorHoraPeronal=" + valorHoraPeronal +  ", Salário: " + calcularSalario() + '}';
    }
    
    
    
    
    
    
}
