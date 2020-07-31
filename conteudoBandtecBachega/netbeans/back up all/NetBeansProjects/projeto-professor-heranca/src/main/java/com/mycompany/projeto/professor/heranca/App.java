/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.professor.heranca;

/**
 *
 * @author digital
 */
public class App {
    
    public static void main(String[] args) {
        
        Professor p1 = new Professor("Miltinho", 892367, 20, 50.0);
        p1.calculaSalario();
         Professor p2 = new Professor("efhsfgsfdg", 89467, 20, 50.0);
         p2.calculaSalario();
          Professor p3 = new Professor("miltinha", 892347, 20, 50.0);
          p3.calculaSalario();
           Professor p4 = new Professor("pé de milho", 842367, 20, 50.0);
        p4.calculaSalario();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        Coordenador c1 = new Coordenador(5, 60.0 , "Dados", "Miltinho", 345678, 20, 50.0);
        c1.calculaSalario();
        System.out.println(c1);

        
        Escola e1 = new Escola("Santos Amaro", 3);
        
        
        
        e1.contratarProfessor(c1);
        e1.contratarProfessor(p1);
        e1.contratarProfessor(p2);
        e1.contratarProfessor(p3);
        e1.contratarProfessor(p4);
        
        e1.exibirProfessores();
        
        System.out.println(e1);
        
    }
    
}
