
package com.mycompany.raphael.bachega.c3;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    
    private String nome;
    private List<Medico> list = new ArrayList();

    public Hospital(String nome) {
        this.nome = nome;
    }
    
    public void contrataMedico(Medico m){
        list.add(m);
    }
    
    public void exibeClinicos(){
        System.out.println("\n----- Lista de clínicos -----\n");
        if(!list.isEmpty()){
            for (Medico medico : list) {
                if(medico instanceof MedicoClinico){
                    System.out.println(medico);
                }
            }
        }
        else{
            System.out.println("\nNão existem médicos clínicos contratados.");
        }
    }
    
    public void exibeAnestesistas(){
        System.out.println("\n----- Lista de Anestesistas -----\n");
         if(!list.isEmpty()){
            for (Medico medico : list) {
                if(medico instanceof MedicoAnestesista){
                    System.out.println(medico);
                }
            }
        }
        else{
            System.out.println("\nNão existem médicos anestesistas contratados.");
        }
    }
    
    public void exibeFolhaDePagamento(){
        Double total = 0.0;
        System.out.println("\nFuncionários a pagar: ");
        if(!list.isEmpty()){
            
            for (Medico medico : list) {
                total += medico.calculaSalario();
                System.out.println(medico.getNome()+ "  Salário: " + medico.calculaSalario());
            }
            System.out.println("\nTotal a pagar: "+ total);
        }
        else{
            System.out.println("Não existem médicos a serem pagos...");
        }
        
    }
    
}
