
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
   
   /**
    * Metodo que faz override do construtor
    */
   public Comentario(){
    titulo = "Facebook";
    descricao = "tudo por aqui";
}
    
   
   /**
    * Metodo que retorna usuario
    * @return 
    */
    public Usuario getUsuario() {
        return usuario;
    }
    
    /**
     * Metodo que seta usuario
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /**
     * Metodo que retorna o artigo
     * @return 
     */

    public Artigo getArtigo() {
        return artigo;
    }
   /** 
    * Metodo que seta o artigo
    * @param artigo 
    */

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
     
   /**
    * Metodo  que retorna o titulo
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
     * metodo que seta descricao
     * @param descricao 
     */

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
          
}
