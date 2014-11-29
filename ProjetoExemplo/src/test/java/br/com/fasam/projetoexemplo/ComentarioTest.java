/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;


import br.com.fasam.projetoexemplo.entidades.Artigo;
import br.com.fasam.projetoexemplo.entidades.Comentario;
import br.com.fasam.projetoexemplo.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ComentarioTest extends TestCase {
    
    public ComentarioTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testComentario(){
        String titulo = "Integracao de Software";
        String descricao ="Utilizar ferramentas que Integrem "
           + "Desenvolvimento com framework de desenvolvimento ageis" ;
        Usuario usuario = new Usuario();
        Artigo artigo = new Artigo(usuario);

        
        Comentario comentario = new Comentario(titulo, descricao, usuario, artigo);
       assertNotNull(comentario.getTitulo());
       assertNotNull(comentario.getArtigo());
       assertNotNull(comentario.getUsuario());
       assertNotNull(comentario.getDescricao());
    } 
}
