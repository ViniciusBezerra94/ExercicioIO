/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioio;

import java.awt.Dimension;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




/**
 *
 * @author Vinicius
 */
public class Mostrar {

    
    public void mostrar() throws FileNotFoundException {

    String mostra = "";
    String nomeArq="texto.txt"; //Nome do arquivo, pode ser absoluto, ou pastas /dir/teste.txt
    String linha="";
    File arq = new File(nomeArq);
 
    //Arquivo existe
    if (arq.exists()){
      mostra="Arquivo - '"+" Texto "+"', aberto com sucesso!\n";
      mostra+="Tamanho do arquivo: "+Long.toString(arq.length())+"\n";
      //tentando ler arquivo
      try{
        mostra+="Conteudo:\n";
        //abrindo arquivo para leitura
        FileReader reader = new FileReader(nomeArq);
        //leitor do arquivo
        BufferedReader leitor = new BufferedReader(reader);
        while(true){
          linha=leitor.readLine();
          if(linha==null)
            break;
          mostra+=linha+"\n";
        }
      }
      catch(Exception erro) {
          System.out.println("Erro ao tentar visualizar arquivo: " + erro.getMessage());
      }
      
      //JOptionPane.showMessageDialog(null,mostra,"Arquivo...",1);
      String s = "";
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(450,400));
        
        Object message;        
        JTextArea textArea = new JTextArea(mostra);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new Insets(5,5,5,5));
        textArea.setEditable(false);
        scrollPane.getViewport().setView(textArea);
        message = scrollPane;
        JOptionPane.showMessageDialog(null, message);
        
        
  

        
        
    }
    //Se nao existir
    else
      JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
    }
}
