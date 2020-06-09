package br.edu.fafic.es.app;




import br.edu.fafic.es.classes.Contato;
import br.edu.fafic.es.dao.Agenda;
import br.edu.fafic.es.classes.Endereco;


import javax.swing.JOptionPane;

public class AppAgenda {

    
    public static void main(String[] args) {
        
        boolean retorno = true;
        
        Contato contato = new Contato ();
        Agenda agenda = new Agenda ();
      
        
         
        while (retorno){
            
           int opcao = Integer.parseInt(JOptionPane.showInputDialog(String.format(
                   
                   "======= CONTATOS ======= %n"
                    + "1 - Cadastrar o cliente %n"
                    + "2 - Atualizar o telefone do cliente cadastrado %n"
                    + "3 - Deletar o cliente cadastrado %n"
                    + "4- Localizar o contato cadastrado %n"
                    + "5 - Exibir a lista dos clientes %n"
                    + "0 - Sair %n"
                    + "==========================%n"
                    + "Digite a opção: "
                   )));
       
        switch (opcao){
                
       //Inserir o cliente    
        case 1:
           
  
               contato = new Contato (JOptionPane.showInputDialog ("Nome: "),
                       JOptionPane.showInputDialog("Telefone:  "), 
                       
                       new Endereco( JOptionPane.showInputDialog ("Rua: "),
                       JOptionPane.showInputDialog("Bairro: "),
                       JOptionPane.showInputDialog("Cidade: "),
                       JOptionPane.showInputDialog ("Estado: "))
             
               );
               
               
            
        agenda.cadastrarContato(contato);      

        break;

        
        
        //Atualizar o telefone do cliente
        case 2:
            
            
          String nome = JOptionPane.showInputDialog("Digite o nome: "); 
          String telefone1 = JOptionPane.showInputDialog(String.format("Atualizar "
                  + "o telefone de %s:  ", nome));
          
        
             contato.setTelefone(telefone1);
            
            JOptionPane.showMessageDialog(null, agenda.atualizarTelefone(telefone1));
          
      
           
       
       break;
        
        
        //Deletar o cliente cadastrado
        case 3:
          
         
            String remover = JOptionPane.showInputDialog("Digite o nome:");
            
            if (remover != null){
                agenda.excluirContato(remover);
                
            } 
                 
       break;
       
       
       // Pesquisar o contato cadastrado
        case 4:
           
            String localizar = JOptionPane.showInputDialog("Digite o nome:");
            
            
            if (localizar != null){    
                
                
                agenda.pesquisarContato(localizar);
          
    
          
            } else {
                 JOptionPane.showMessageDialog(null, contato, "Aviso", JOptionPane.ERROR_MESSAGE);
                    
            }
         
            break;
            
              
        // Exibir a lista de todos os clientes
        case 5:
           
            
         JOptionPane.showMessageDialog(null, agenda.exibirContatos());
         
         break;
            
         
       //Sair o aplicativo
        case 0:
           
            retorno = false;
            
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
            
        break;
     
        //Opção indisponível
        default:
            
            JOptionPane.showMessageDialog(null, "Opção indisponível!", "Aviso",JOptionPane.ERROR_MESSAGE);
        
      
        
    }
        
    }
    
    }
    
}
