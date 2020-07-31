
package com.mycompany.lista7;


public class Termometro {
   private Double temperaturaAtual,temperaturaMax,temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    
    
    
    Double aumentaTemperatura(Double temperaturaAtual){
        this.temperaturaAtual += temperaturaAtual;
            if(temperaturaAtual > temperaturaMax){
                temperaturaMax = temperaturaAtual;
            }
        return temperaturaAtual;
    }
    
    Double diminuiTemperatura(Double temperaturaAtual){
        this.temperaturaAtual -= temperaturaAtual;
            if(temperaturaAtual > temperaturaMin){
                temperaturaMin = temperaturaAtual;
            }
        return temperaturaAtual;
    }
    
    Double exibeFahreinheit(Double fahrein){
        fahrein = ((temperaturaAtual * 9/5)+32);
        return fahrein;
    }
    
    
    void mostrar(){
        System.out.println("Fahreinheit: "+ exibeFahreinheit(temperaturaAtual)+"Fº");
        System.out.println("Celcius: "+temperaturaAtual+"ºC");
        System.out.println("Temperatura maxima: "+ temperaturaMax);
        System.out.println("Temperatura minima: "+ temperaturaMin);
        System.out.println("====================================\n");
    }
}
