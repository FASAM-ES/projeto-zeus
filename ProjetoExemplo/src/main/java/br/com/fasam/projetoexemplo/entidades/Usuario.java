
package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
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
    List<Comentario> Comentarios;
   
    public Usuario (){
        this.nome = "Pedro";
        this.cpf = "01234567890";
        this.senha = "123";
        this.telefone = "91285591";
    }

    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }

    
    
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
        public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.Comentarios.add(comentario);
    }
        
    public void remComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios.remove(comentario);
        }
    }
        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
