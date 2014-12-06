
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Henrique Dourado
 */
public class Categoria {
    String nome; 
    String descricao;
    List<Artigo> artigos;
    
    /**
     * Metodo inicializar a variavel nome
     */
    public Categoria(){
    this.nome = "TI";
    }
    /**
     * Metodo de retorno artigos
     * @param i
     * @return 
     */
     public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
     /**
      * Metodo de criacao da lista de artigos
      */
    public void addArtigo(){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
    }
    /**
     * Metodo para limpar a variavel artigos
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }

    /**
     * Metodo de retorno nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo para setar nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo de retorno descricao
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Metodo para setar descricao
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
