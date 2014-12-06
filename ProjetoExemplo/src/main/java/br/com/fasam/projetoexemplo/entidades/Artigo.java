
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Carlos Ottobboni
 */

  public class Artigo {
     String titulo;
     String descricao;
     Usuario usuario;
     List<Comentario> comentarios;
     List<Tag> tags;

     /**
      * Metodo de inicializacao das variaveis
      * @param usuario 
      */
     public Artigo(Usuario usuario){
     this.usuario = usuario;
     this.titulo = "Ciências aplicadas Globais";
     this.descricao = "Artigo referente a materia de Ciências Aplicadas, necessario que o usuario tenha sido aprovado no Modulo01";
      this.addTag(new Tag());
     }

     /**
      * Metodo que retorna usuário
      * @return 
      */
    public Usuario getUsuario() {
        return usuario;
    }
    
    /**
     * Metodo que seta usuário
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo que retorna usuário
     * @param i
     * @return 
     */
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }

    /**
     * Metodo que adiciona comentarios
     * @param comentario 
     */
    public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }

    /**
     * Metodo que remove comentarios
     * @param comentario 
     */
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }

    /**
     * Metodo que retorna tag
     * @param i
     * @return 
     */
     public Tag getTag(Integer i){
        return tags.get(i);
    }

     /**
      * Metodo que adiciona uma tag a lista
      * @param tag 
      */
     public void addTag(Tag tag){
        if(this.tags == null){
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tag);
    }

     /**
      * Metodo que remove uma tag da lista
      * @param tag 
      */
     public void remTag(Tag tag){
        if(this.tags == null){
            this.tags.remove(tag);
        }
    }

     /**
      * Metodo que retorna titulo
      * @return 
      */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo que seta o titulo
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que retorna descricao
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Metodo que seta descricao
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
