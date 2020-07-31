/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste.bd;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author digital
 */
public class Conexao {
    
    private BasicDataSource dataSource;
    
    public Conexao(){
//        objeto
        dataSource = new BasicDataSource();
        
//        posso usar os metodos de sua instância
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:~/testdb");
        
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
        
    
}
