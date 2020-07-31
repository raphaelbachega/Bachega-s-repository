/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica.abstrata;

/**
 *
 * @author digital
 */
public class App {
    public static void main(String[] args) {
        
        Quadrado q = new Quadrado(6.0, "azul", 3);
        Retangulo r = new Retangulo(3.0, 4.0, "verde", 6);
        Triangulo t = new Triangulo(8.0,16.0, "amarelo", 10);
        Circulo c = new Circulo(15.0, "verde canario", 20);

        
        Imagem i = new Imagem();
        
        i.adicionaFigura(q);
        i.adicionaFigura(r);
        i.adicionaFigura(t);
        i.adicionaFigura(c);
        
        i.exibeFiguras();
        i.exibeSomeArea();
        i.exibeFiguraMaior20();
        i.exibeQuadrado();
    }
        
}
