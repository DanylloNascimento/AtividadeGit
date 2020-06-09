/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.es.classes;

/**
 *
 * @author laelk
 */
public class Endereco {
    
    private final String rua, bairro, cidade, estado;
   
    
    public Endereco(String rua, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
    @Override
    public String toString (){
        
        
       return String.format(
                 "Rua: %s%n"
                + "Bairro: %s%n"
                + "Cidade: %s%n"
                + "Estado: %s%n", getRua(), getBairro(), getCidade (), getEstado ());   
    }
  
}
