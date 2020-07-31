package com.mycompany.projeto.encapsulamento;


public class Motor {

    private Double velocidade = 0.0;
    Boolean status = false;
    String texto;
    
    public Double getVelocidade(){
        return velocidade;
    }
 
    void ligado() {
        status = true;
        texto = "Ligado";
    }

    void desligado() {
        status = false;
        velocidade = 0.0;
        texto = "Desligado";
    }

    void velocidadeAcelera() {
        if (status == true) {
            if(velocidade < 120.0){
            this.velocidade += 10.0;
            }
        }     
    }

    void velocidadeFreia() {
        if (status == true) {
            if(velocidade > 0){
            this.velocidade -= 10.0;
            }
        }
    }

}
