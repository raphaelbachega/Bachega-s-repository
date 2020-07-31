
package com.mycompany.banco.mysql;

import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    
    private BasicDataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    TesteMetodos t1 = new TesteMetodos();
    
    public Conexao(){
        dataSource = new BasicDataSource();
        
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        
        dataSource.setUrl("jdbc:mysql://localhost:3306/shadowtec");
        
        dataSource.setUsername("root");
        
        dataSource.setPassword("@Bateria2007");
        
        jdbcTemplate = new JdbcTemplate(this.dataSource);
        
    }
     public List listarTodos(){
        List<Map<String,Object>> lista = jdbcTemplate.queryForList("SELECT * FROM numeros");
        return lista;
    }
     public void incluir(){
         jdbcTemplate.update("INSERT INTO numeros (nome, cpf) Values (?,?)", "lucas","12345678");
     }
     public void incluirNumero(){
         jdbcTemplate.update("INSERT INTO numeros (numero) VALUES (?)", t1.conta());
                 
     }

    @Override
    public String toString() {
        return "Conexao{" + "dataSource=" + dataSource + ", jdbcTemplate=" + jdbcTemplate + '}';
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    
    public BasicDataSource getDataSource(){
        return dataSource;
    }
    
}
