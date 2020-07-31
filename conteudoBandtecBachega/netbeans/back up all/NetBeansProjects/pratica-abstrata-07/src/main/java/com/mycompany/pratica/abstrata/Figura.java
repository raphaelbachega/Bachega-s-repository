
package com.mycompany.pratica.abstrata;

public abstract class Figura {
    
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calculaArea();

    @Override
    public String toString() {
        return "Figura{" + "cor=" + cor + ", espessura=" + espessura + '}';
    }

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }
    
            
}
