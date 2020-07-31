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
public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro termometro1 = new Termometro(20.0,40.0,6.0);
        
        termometro1.aumentaTemperatura(20.0);
        termometro1.mostrar();
        
        termometro1.diminuiTemperatura(10.0);
        termometro1.mostrar();
        
        // -------------------------------------------//
        
        Termometro termometro2 = new Termometro(0.0,0.0,0.0);
        
        termometro2.aumentaTemperatura(20.0);
        termometro2.mostrar();
        
        termometro2.diminuiTemperatura(10.0);
        termometro2.mostrar();
    }
    
}
