
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anoar Geraldino Filho
 */
public class Tag {
    String nomeTag;
    String descricaoTag;
    List<Artigo> artigosTag;
    
    /**
     * Metodo inicializar e setar variaveis
     */
    public Tag(){
        this.nomeTag = "Teste de Nome";
        this.descricaoTag = "Teste de Descricao";
    }
    
    /**
     * Metodo de retorno artigosTag
     * @param i
     * @return 
     */
    public Artigo getArtigo(Integer i){
        return artigosTag.get(i);
    }
    
    /**
     * Metodo de criacao da lista de artigos
     */
    public void addArtigo(){
        if(this.artigosTag == null){
            this.artigosTag = new ArrayList<Artigo>();
        }
    }
    
    /**
     * Metodo para limpar a variavel artigosTag
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if(this.artigosTag != null){
            this.artigosTag.remove(artigo);
        }
    }

    /**
     * Metodo de retorno nomeTag
     * @return 
     */
    public String getNome() {
        return nomeTag;
    }

    /**
     * Metodo para setar nomeTag
     * @param nome 
     */
    public void setNome(String nome) {
        this.nomeTag = nome;
    }

    /**
     * Metodo de retorno descricaoTag
     * @return 
     */
    public String getDescricao() {
        return descricaoTag;
    }

    /**
     * Metodo para setar descricaoTag
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricaoTag = descricao;
    }
}
