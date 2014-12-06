
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
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }

     public Tag getTag(Integer i){
        return tags.get(i);
    }
     public void addTag(Tag tag){
        if(this.tags == null){
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tag);
    }
     public void remTag(Tag tag){
        if(this.tags == null){
            this.tags.remove(tag);
        }
    }
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
