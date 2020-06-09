
package br.edu.fafic.es.dao;

import br.edu.fafic.es.classes.Contato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agenda {
    
    
      ArrayList <Contato> contatos = new ArrayList <>();

   
    public boolean cadastrarContato (Contato contato){
        
        
        JOptionPane.showMessageDialog(null, "Contato cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
  
       return contatos.add(contato);
        
    }
    
    public Contato excluirContato (String nome){
        
        
      
        for (int m = 0; m < contatos.size(); m++){
            
        if (contatos.get(m).getNome().equalsIgnoreCase(nome)){
          
            
             JOptionPane.showMessageDialog(null, contatos.remove(m));
            
        } 
          }
        
        return null;
            
      
   }
    public Contato atualizarTelefone (String telefone){
        
          
        for (int m = 0; m < contatos.size(); m++) {
                
        if (contatos.get(m).getTelefone().equalsIgnoreCase(telefone)){
                
             JOptionPane.showMessageDialog(null, contatos.get(m));
         } 
         
    
            }
   
        
    return null;
        
    }
    
 
    public Contato pesquisarContato (String nome) {
        
     
        
       for (int m = 0; m < contatos.size(); m++){
            
        if (contatos.get(m).getNome().equalsIgnoreCase(nome)){
            
              
        JOptionPane.showMessageDialog(null, contatos.get(m));
                
            
        }
        
       }
   
        
           
       return null;
   
    }
   public Object exibirContatos (){
       
       
       return  contatos.toArray();
           
   }
    
}
