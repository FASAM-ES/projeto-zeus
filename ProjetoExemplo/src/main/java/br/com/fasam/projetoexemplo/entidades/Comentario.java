
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
     /**
     * Cosntrutor override
     */
   

  
   
   
    public Usuario getUsuario() {
        return usuario;
    }
     /**
     * Retorna usuario
     */

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     /**
     * seta usuario
     */

    public Artigo getArtigo() {
        return artigo;
    }
     /**
     * Retorna artigo
     */

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
     /**
     * Seta  artigo
     */
   

    public String getTitulo() {
        return titulo;
    }
     /**
     * Retorna titulo
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     /**
     * Seta titulo
     */

    public String getDescricao() {
        return descricao;
    }
     /**
     * Retorna descricao
     */

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     /**
     * set descricao
     */
          
}
