
package com.mycompany.raphael.bachega.c3;

public class App {
    
    public static void main(String[] args) {
        
        Instrutor i1 = new Instrutor("biruguelas", 4, 100.0);
        i1.calcularSalario();
        System.out.println(i1);
        
        Instrutor i2 = new Instrutor("leo stronda", 4, 150.0);
        i2.calcularSalario();
        System.out.println(i2);
        
        
        Personal p1 = new Personal(4, 300.0, "fernando sardinha", 4, 300.0);
        p1.calcularSalario();
        System.out.println(p1);
        
        Personal p2 = new Personal(2, 350.0, "chimbinha", 2, 350.0);
        p2.calcularSalario();
        System.out.println(p2);
        
        Academia a1 = new Academia("bache gym", 3);
        a1.contratarInstrutor(i2);
        a1.contratarInstrutor(p1);
        a1.contratarInstrutor(p2);
        a1.contratarInstrutor(i1);
        
        System.out.println(a1);
        
        System.out.println("\n\n");
        
        a1.exbirInstrutores();
        
        
    }
    
}
