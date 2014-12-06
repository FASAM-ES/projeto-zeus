
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Henrique Alves
 */
public class Usuario {
    int id;
    String nome;
    String email;
    String senha;
    String telefone;
    String cpf;
    List<Artigo> artigos;
    List<Comentario> comentarios;
   /**
    * metodo usuario
    */
    public Usuario (){
        this.nome = "Pedro";
        this.cpf = "01234567890";
        this.senha = "123";
        this.telefone = "91285591";
    }
/**
 * 
 * @param i
 * @return qtde de artigos
 */
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    /**
     * @return add artigos
     * @param artigo 
     */
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    /**
     * @return remove artigo
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }

    
    /**
     * 
     * @param i
     * @return qtde de comentarios
     */
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
    /**
     * @return add comentario
     * @param comentario 
     */
        public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    /**
     * @return exclui comentario
     * @param comentario 
     */
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }
        
    /**
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return senha
     */
    public String getSenha() {
        return senha;
    }
    /**
     * 
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * 
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * 
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * 
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * 
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
