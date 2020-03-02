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
public class ContadorVariado {
    public static void main(String[] args) {
        
        for(Double num = 0.15; num <=5; num +=0.15){
            System.out.println(String.format("%.2f", num));
        }
    }
}
