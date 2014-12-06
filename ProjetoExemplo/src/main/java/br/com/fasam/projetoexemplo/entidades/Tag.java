
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Tag {
    String nomeTag;
    String descricaoTag;
    List<Artigo> artigosTag;
    
    public Tag(){
        this.nomeTag = "Teste de Nome";
        this.descricaoTag = "Teste de Descricao";
        //Teste
    }
    
    public Artigo getArtigo(Integer i){
        return artigosTag.get(i);
    }
    public void addArtigo(){
        if(this.artigosTag == null){
            this.artigosTag = new ArrayList<Artigo>();
        }
    }
    public void remArtigo(Artigo artigo){
        if(this.artigosTag != null){
            this.artigosTag.remove(artigo);
        }
    }

    public String getNome() {
        return nomeTag;
    }

    public void setNome(String nome) {
        this.nomeTag = nome;
    }

    public String getDescricao() {
        return descricaoTag;
    }

    public void setDescricao(String descricao) {
        this.descricaoTag = descricao;
    }
}
