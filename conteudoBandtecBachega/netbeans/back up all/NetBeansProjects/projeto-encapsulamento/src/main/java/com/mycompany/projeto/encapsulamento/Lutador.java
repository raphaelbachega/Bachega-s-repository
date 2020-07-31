/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

/**
 *
 * @author digital
 */
public class Lutador {
     private Integer vida1 = 100;
     private Integer vida2 = 100;
   String texto1 ="", texto2 ="", buakaw ="Buakaw", cosmo ="Cosmo";


    public Integer getLutador1() {
        return vida1;
    }
    public Integer getLutador2() {
        return vida2;
    }

   
   void apanhar1(){
       if(vida2 > 0){
                if(vida1 > 0){
        vida1 -= 10;   
       }
       if(vida1 <= 0){
          
           texto1 = String.format("Lutador %s Perdeu", buakaw);
       }  
       }

   }
   void restaurar1(){
       if(vida2 > 0){
           if(vida1 > 0){
       vida1 += 2;
       }
   }
       }
       
   void apanhar2(){
        if(vida1 > 0){
           if(vida2 > 0){
        vida2 -= 10;   
       }
       if(vida2 <= 0){
          
           texto2 = String.format("Lutador %s Perdeu", cosmo);
       }
       }
       
   }
   void restaurar2(){
        if(vida1 > 0){
            if(vida2 > 0){
       vida2 += 2;
       }
   }
       }
      
}


