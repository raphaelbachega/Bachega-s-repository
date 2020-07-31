/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.jdbc;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author digital
 */
public class ProgramaLeitura {
    public static void main(String[] args) {
        
        ConexaoDados con = new ConexaoDados();
        
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());
        
//        template.update("insert into leitura (origem, valor, data_hora) values (?,?,?)", "CPU", 93, LocalDateTime.now());
        
//        template.update("delete from leitura where origem = ?", "CPU");
        
//        template.execute("truncate table leitura");
    
        
        List ocorrencias = template.queryForList("SELECT * FROM LEITURA;");
        
        System.out.println(ocorrencias);
        
        
    }
}
