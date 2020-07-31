
package com.mycompany.atleta.corredor;

public class Corredor {
    
    protected String tipoFisico;
    protected String performance;
    protected Double tempoMedio;

    public Corredor(String tipoFisico, String performance, Double tempoMedio) {
        this.tipoFisico = tipoFisico;
        this.performance = performance;
        this.tempoMedio = tempoMedio;
    }

    public String getTipoFisico() {
        return tipoFisico;
    }

    public String getPerformance() {
        return performance;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }
    
    
    
}
