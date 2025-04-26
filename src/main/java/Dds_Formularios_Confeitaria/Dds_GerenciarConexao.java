/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dds_Formularios_Confeitaria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Dionnes
 */
public class Dds_GerenciarConexao extends Thread {
    
    private Socket Dds_conexao;
    private Dds_Conexao_Funcionario Form;

    public Dds_GerenciarConexao(Socket Dds_conexao, Dds_Conexao_Funcionario Form) {
        this.Dds_conexao = Dds_conexao;
        this.Form = Form;
    }
    
    @Override
    public void run(){
        try {
            BufferedReader Dds_entrada = new BufferedReader(new InputStreamReader(Dds_conexao.getInputStream()));
            
            
        } catch (Exception e) {
        }
    }
    
}
