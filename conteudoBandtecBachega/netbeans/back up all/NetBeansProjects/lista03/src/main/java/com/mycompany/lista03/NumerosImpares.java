/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

/**
 *
 * @author rapha
 */
public class NumerosImpares {
    public static void main(String[] args) {
        Integer cont;
        
        cont = 1;
        while(cont <91){
            if(cont %2 ==1){
            System.out.println(cont+" ");
            }
            cont++;
        }
        
    }
    
}
