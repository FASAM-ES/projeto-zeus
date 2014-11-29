/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Categoria {
    String nome; 
    String descrição;
    List<Artigo> artigos;
    
    public Categoria(){
    this.nome = "TI";
    }
     public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
    }
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
}
