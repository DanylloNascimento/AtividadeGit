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
public  class Contato {
    
    private  String nome, telefone; 
    private  Endereco endereco;
    
    
    public Contato (){
        
    }

    public Contato(String nome, String telefone, Endereco endereco) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
       
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    
    @Override
    public String toString (){
        
       return String.format("===== CLIENTE ======%n"
        + "Nome: %s%n"
        + "Telefone: %s%n%n"
        + " ========= ENDEREÇO ===== %n"
               + "%s%n", getNome (), getTelefone(), getEndereco ());
    }  
}
