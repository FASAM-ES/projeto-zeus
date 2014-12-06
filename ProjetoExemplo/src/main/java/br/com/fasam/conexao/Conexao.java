/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.conexao;

/**
 *
 * @author Pedro Henrique Alves
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost/fasam";
    private static String usuario = "postgres";
    private static String senha = "fasam";
    /** 
     * Contrutor override conexao
     */
    private Conexao(){
    }
   /**
    * Metodo que estabelece a conexao
    * @return 
    */
    public static Connection getConexao() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
    
    }