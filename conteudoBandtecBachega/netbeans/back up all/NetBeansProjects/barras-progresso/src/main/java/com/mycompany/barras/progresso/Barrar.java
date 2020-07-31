/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barras.progresso;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author digital
 */
public class Barrar {
    
        
    Random aleatorio = new Random();
    String texto;
    Integer valor = 0;
    Color cor;
    
    void sortear(){
        valor = aleatorio.nextInt(101);
        
    }
    void textear(){
        if(valor <= 20){
           texto = "Suave!";
           cor = Color.blue;
        }
        else if(valor <= 70){
            texto = "Atenção!";
            cor = Color.MAGENTA;
        }   
        else{
            texto = "Perigo!";
            cor = Color.red;
        }
    }
    
    
    
    }
    

