/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapallet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author minec
 */
public class ArquivoPallet 
{
    File arqtexto = new File("D:\\Programas\\Net-Beans\\repos\\Projeto Pilha\\src\\javapallet\\SalvaArquivo\\arquivo.txt");
    public void arquivoCheck(Stack pilha)
    {
        FormSistema Sist = new FormSistema(); 
        //Codigo para salvar arquivos----------------------------------------------------------------------------------------
        try
        {
            //File arquivo = new File("./database/stack.txt");
            if (!arqtexto.exists())
            {
                arqtexto.createNewFile();
                System.out.println("arquivo de texto criado.");
                FileWriter arqescreve = new FileWriter("D:\\Programas\\Net-Beans\\repos\\Projeto Pilha\\src\\javapallet\\SalvaArquivo\\arquivo.txt");
                arqescreve.write(pilha.toString() + "\n");
                System.out.println("Produto adicionado!!");
            }
            else
            {
                System.out.println("O arquivo de texto ja existe.");
                FileWriter arqescreve = new FileWriter("D:\\Programas\\Net-Beans\\repos\\Projeto Pilha\\src\\javapallet\\SalvaArquivo\\arquivo.txt");
                arqescreve.write(pilha.toString() + "\n");
                System.out.println("Produto adicionado!!");
                arqescreve.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("Ocorreu um erro envolvendo o arquivo de texto.");
            e.printStackTrace();
        }
        //----------------------------------------------------------------------------------------------------------------------
    }
}
