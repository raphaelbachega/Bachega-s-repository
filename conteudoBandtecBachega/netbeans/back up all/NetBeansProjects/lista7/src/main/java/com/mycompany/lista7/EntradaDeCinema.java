
package com.mycompany.lista7;


public class EntradaDeCinema {
    private Integer hora,sala,valor;
    private String nome;

    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }
    
    
    
    public Integer calculaDesconto(Boolean estudante, Integer idade){
       
       if(idade <12 ){
           this.valor = valor/2;     
        }
       else if(estudante == true && idade < 16){
           this.valor = valor -((valor*40)/100);
       }
       else if(estudante == true && idade < 21){
           this.valor = valor - ((valor*30)/100);
       }
       else if(estudante == true && idade > 20){
           this.valor = valor - ((valor*20)/100);
       } 
        calculaDescontoHorario();
      
        return this.valor;
        
    }
    
    
    Integer calculaDescontoHorario(){
        if(this.hora < 16){
        valor = valor -((valor*10)/100);
        }
        return this.valor;
    }
    void ingresso(){
        System.out.println("Ingresso cinema\n");
        System.out.println("Horario: " + hora + "hrs.");
        System.out.println("Sala: " + sala);
        System.out.println("Valor: R$" + valor);
        System.out.println("Nome: " + nome);
        System.out.println("=============================");
    }
}






