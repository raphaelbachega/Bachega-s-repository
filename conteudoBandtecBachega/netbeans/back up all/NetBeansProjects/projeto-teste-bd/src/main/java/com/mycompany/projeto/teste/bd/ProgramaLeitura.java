/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste.bd;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author digital
 */
public class ProgramaLeitura {
    public static void main(String[] args) {
        
        Conexao con = new Conexao();
        
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());
        
        template.update("INSERT INTO LEITURA(ORIGEM, VALOR, DATA_HORA) VALUES (?,?,?)", "CPU", 10, LocalDateTime.now()); 
        
        
        List leituras = template.queryForList("SELECT * FROM leitura;");
       

        System.out.println(leituras);
    }
}
