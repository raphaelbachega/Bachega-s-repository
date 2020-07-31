/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista7;

/**
 *
 * @author digital
 */
public class Cinema {
    public static void main(String[] args) {
         EntradaDeCinema ingresso1 = new EntradaDeCinema(11,4,20,"Jobson");
         
         ingresso1.calculaDesconto(true,13);
         ingresso1.ingresso();
   
         EntradaDeCinema ingresso2 = new EntradaDeCinema(18,7,40,"Gertrudes");
         
         ingresso2.calculaDesconto(true,79);
         ingresso2.ingresso();
         
    }
    
   
}
