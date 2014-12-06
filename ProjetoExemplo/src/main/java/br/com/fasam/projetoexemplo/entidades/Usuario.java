
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
    * Metodo que faz override do construtor
    */
    public Usuario (){
        this.nome = "Pedro";
        this.cpf = "01234567890";
        this.senha = "123";
        this.telefone = "91285591";
    }
/**
 * Metodo que retorna o artigo
 * @param i
 * @return 
 */
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    /**
     * Metodo que adiciona Artigos
     * @return
     * @param artigo 
     */
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    /**
     * Metodo que remove o Artigo
     * @return 
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }

    
    /**
     * Metodo que retorna os comentarios
     * @param i
     * @return 
     */
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
    /**
     * Metodo que adiciona os comentarios
     * @return 
     * @param comentario 
     */
        public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    /**
     * Metodo que exclui os comentarios
     * @return 
     * @param comentario 
     */
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }
        
    /**
     * Metodo que retorna o id
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo que seta o id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo que retorna o nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo que seta o nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Metodo que retorna o email
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Metodo que seta o email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Metodo que retorna a senha
     * @return senha
     */
    public String getSenha() {
        return senha;
    }
    /**
     * Metodo que seta a senha
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Metodo que retorna o telefone
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Metodo que seta o telefone
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * Metodo que retorna o cpf
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * Metodo que seta o cpf
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
