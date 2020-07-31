/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista06;

/**
 *
 * @author digital
 */
public class Urna {
    Integer voto1 = 0, voto2 = 0,total = 0;
    String texto = "";

    public Integer getVoto1() {
        return voto1;
    }

    public Integer getVoto2() {
        return voto2;
    }

    public Integer getTotal() {
        return total;
    }

    void votar1(){
        if(texto.equals("")){
        voto1 ++;
        total ++;
        }
    }
    void votar2(){
        if(texto.equals("")){
        voto2 ++;
        total ++;
        }
    }
    void frase(){
        if(voto1 > voto2){
            texto = "Candidato 1 Venceu!";
        }
        else if(voto1 < voto2){
            texto = "Candidato 2 Venceu!";
        }
        else{
            texto = "Empate!";
        }
    }
}
