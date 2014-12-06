
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

     public Artigo(Usuario usuario){
     this.usuario = usuario;
     this.titulo = "Ciências aplicadas Globais";
     this.descricao = "Artigo referente a materia de Ciências Aplicadas, necessario que o usuario tenha sido aprovado no Modulo01";
      this.addTag(new Tag());
     }
    /**
     * Metodo que faz override do construtor padrão
     */

    public Usuario getUsuario() {
        return usuario;
    }
    /**
     * Metodo que Retorna usuário
     * @return Usuario
     * 
     */
     

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     /**
     * Metodo que seta usuário
     */

    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
      /**
     * Metodo que retorna usuário
     */
    public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    /**
     * Metodo que adiciona comentarios
     */
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }
    /**
     * Metodo que remove comentarios
     */

     public Tag getTag(Integer i){
        return tags.get(i);
    }
     /**
     * Metodo que retorna tag
     */
     public void addTag(Tag tag){
        if(this.tags == null){
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tag);
    }
     /**
     * Metodo que adicona uma tag a lista 
     */
     public void remTag(Tag tag){
        if(this.tags == null){
            this.tags.remove(tag);
        }
    }
     /**
     * Metodo que remove uma tag da lista
     */
 
    public String getTitulo() {
        return titulo;
    }
    /**
     * Metodo que retorna titulo
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Metodo que seta  o titulo
     */

    public String getDescricao() {
        return descricao;
    }
    /**
     * Metodo que retorna descricao
     */

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Metodo que seta descricao 
     */

    
}
