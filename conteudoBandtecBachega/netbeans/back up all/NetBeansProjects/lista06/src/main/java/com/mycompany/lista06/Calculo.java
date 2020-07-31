
package com.mycompany.lista06;


public class Calculo {
     Double resultado;
 

    public Double getResultado() {
        return resultado;
    }

     void soma(Double numero1, Double numero2){ 
         resultado = numero1 + numero2;
     }
     void subtracao(Double numero1, Double numero2){        
         resultado = numero1 - numero2;
     }
     void multiplicacao(Double numero1, Double numero2){        
         resultado = numero1 * numero2;
     }
     void divisao(Double numero1, Double numero2){   
         resultado = numero1 / numero2;
     }
  
}
