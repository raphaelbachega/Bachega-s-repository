
package com.mycompany.funcionarios;

public class ProgramaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Raphael", 22, "47072347801", 500.00);
        Gerente g = new Gerente("Romeu", 19, "45676544567", 25000.00,"Cobrança");
        Cozinheiro c = new Cozinheiro("Hamburguer", "Leo", 20, "12345678912", 10000.00);
        
        f.exibirDados();
        System.out.println("");
        g.exibirDados();
        System.out.println("");
        c.exibirDados(); c.cozinhar();
    }
    
}
