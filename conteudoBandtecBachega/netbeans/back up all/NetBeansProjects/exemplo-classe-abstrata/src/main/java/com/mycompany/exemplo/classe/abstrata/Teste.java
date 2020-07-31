
package com.mycompany.exemplo.classe.abstrata;

public class Teste {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor(20000.00, 0.10, "2343434", "mr.tiltado");
        Horista h = new Horista(40, 100.0 , "23424323", "natasha");
        
        System.out.println(v);
        System.out.println(h);
        
        Empresa bandtec = new Empresa("Bandtec");
        
        bandtec.adicionaFunc(v);
        bandtec.adicionaFunc(h);
        
        bandtec.exibeTodos();
        bandtec.exibeVendedor();
        
        bandtec.exibeTotalSalario();
        
    }
}
