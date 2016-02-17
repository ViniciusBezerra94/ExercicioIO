/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Inserir {

 

    public void inserirTexto(String texto) {
        try {
            File f = new File("texto.txt");// pega o diretorio do arquivo
            FileWriter fw = new FileWriter(f,true); // pega o diretorio do arquivo
            BufferedWriter bw = new BufferedWriter(fw); // classe responsavel por gravar no txt
                    FileReader reader = new FileReader(f); // pega o diretorio do arquivo para ler
                    BufferedReader leitor = new BufferedReader(reader); // classe responsavel por ler o arquivo
                    String linha = leitor.readLine(); // metodo para pegar valor da linha
                    if(linha == null)
                    {
                        bw.write(texto);  // metodo que grava no txt
                       JOptionPane.showMessageDialog(null, "Texto inserido com Sucesso");
                    }else
                    {
                        bw.newLine(); // metodo para pular linha
                        bw.write(texto); 
                        JOptionPane.showMessageDialog(null, "Texto inserido com Sucesso");
                    }

            bw.flush(); 
            bw.close(); 
        } catch (IOException e) 
        { e.printStackTrace();

        }

    }
}