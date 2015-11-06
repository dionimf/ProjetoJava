/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.autentica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class LojaUltimo {

    
    public void GravarUltimo(String fileText){
        FileWriter fw = null;
        String fileName;
        fileName = "Ultimo.txt";
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(fileName, false);
            bw = new BufferedWriter(fw);
            
            bw.write(fileText);
            bw.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
                }
            }

        }
    
    }
    public String Ultimo() throws FileNotFoundException, IOException {
        FileInputStream stream = new FileInputStream("Ultimo.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        return linha.toString();
    
}}
