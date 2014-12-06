
package br.com.fasam.projetoexemplo.entidades;

/**
 *
 * @author Antonio Tavares
 */
public class Comentario {
   String titulo;
   String descricao;
   Usuario usuario;
   Artigo artigo;
   
   public Comentario(){
    titulo = "Facebook";
    descricao = "tudo por aqui";
}
   

  
   
   
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
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
