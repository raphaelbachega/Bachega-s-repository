/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digital
 */
public class Imagem {
    
    private List<Figura> lista;
   

    public Imagem() {
        this.lista = new ArrayList<>();
    }

        public void adicionaFigura(Figura f){
            lista.add(f);
        }
    
        public void exibeFiguras(){
            for (Figura figura : lista) {
                System.out.println(figura);
            }
        }
        
        public void exibeSomeArea(){
            Double soma = 0.0;
            for (Figura figura : lista) {
                soma += figura.calculaArea();
            }
        }
        
        public void exibeFiguraMaior20(){
            for (Figura figura : lista) {
                if (figura.calculaArea() > 20.0) {
                    System.out.println(figura);
                }
            }
        }
        
        public void exibeQuadrado(){
            for (Figura figura : lista) {
            if (figura instanceof Quadrado){
               System.out.println(figura); 
            }
            
        }
        }
        
        
    
    
}
