/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raphael.bachega.ultima.prova;

/**
 *
 * @author digital
 */
public class App {
    
    public static void main(String[] args) {
        
        
        Heroi h1 = new Heroi("One punch man", "Saitama");
        Heroi h2 = new Heroi("Lemilion", "Togata Mirio");
        Heroi h3 = new Heroi("Bachega", "Raphael");
        
        h1.adicionaPoder("Salto Atômico", 20000);
        h1.adicionaPoder("Super soco", 9999999);
        h2.adicionaPoder("Intangibilidade", 1000);
        h2.adicionaPoder("Carisma", 500);
        h3.adicionaPoder("Vontade", 100);
        h3.adicionaPoder("Arte marcial", 100);
        
        Vilao v1 = new Vilao("Lord Boros","Boros");
        Vilao v2 = new Vilao("Overhaul","Kai Chisaki");
        Vilao v3 = new Vilao("Bachega Dark", "Raphael");
        
        v1.adicionaPoder("Regeneração", 99000);
        v1.adicionaPoder("Super força", 1000);
        v2.adicionaPoder("Desmaterialização", 80000);
        v2.adicionaPoder("Inteligencia", 700);
        v3.adicionaPoder("Ódio", 105);
        v3.adicionaPoder("Arte marcial", 105);
        
        Confronto.lutar(h1, v2);
        Confronto.lutar(h2, v2);
        Confronto.lutar(h1, v1);
        Confronto.lutar(h2, v1);
        Confronto.lutar(h3, v3);
    }
    
}
