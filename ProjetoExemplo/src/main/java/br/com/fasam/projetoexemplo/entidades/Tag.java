
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Tag {
    String nome;
    String descricao;
    List<Artigo> artigos;
    
    public Tag(){
        this.nome = "Teste de Nome";
        this.descricao = "Teste de Descricao";
        //Teste
    }
    
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    public void addArtigo(){
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //teste de commit
}
