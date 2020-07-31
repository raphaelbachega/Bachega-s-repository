
package com.mycompany.raphael.bachega.c3;

public class App {
    
    public static void main(String[] args) {
        
        MedicoClinico c1 = new MedicoClinico(5, 200.0,123, "Dr. Hans Chucrutes");
        MedicoClinico c2 = new MedicoClinico(4, 300.0,321,"Dra. Hipopotama");
        MedicoAnestesista a1 = new MedicoAnestesista(7, 500.0, 456, "Dr. Bacano");
        MedicoAnestesista a2 = new MedicoAnestesista(10, 450.0, 156, "Dra. Agnalda");
        
        
        Hospital h1 = new Hospital("Hospital e maternidade São Ilsinho");
        
        h1.contrataMedico(c1);
        h1.contrataMedico(c2);
        h1.contrataMedico(a1);
        h1.contrataMedico(a2);
        
        h1.exibeAnestesistas();
        h1.exibeClinicos();
        
        h1.exibeFolhaDePagamento();
        
    }
    
}
