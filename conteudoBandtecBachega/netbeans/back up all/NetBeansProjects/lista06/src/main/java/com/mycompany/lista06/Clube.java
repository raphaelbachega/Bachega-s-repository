
package com.mycompany.lista06;


public class Clube {
    
    Integer vitorias = 0, empates = 0, derrotas = 0, pontos = 0;
    String texto;
    
    void vitoria(){
        vitorias ++;
        pontos += 3;
        
    }
    void empate(){
        empates ++;
        pontos ++;
        
    }
    void derrota(){
        derrotas ++;
       
    }
    
    void frase(){
        texto = String.format("Vitórias: %d - Derrotas: %d - Empates: %d "
                + "- Pontos: %d", vitorias, derrotas, empates, pontos) ;
    }
     
}
