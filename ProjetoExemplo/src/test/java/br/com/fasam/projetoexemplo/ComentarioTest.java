/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;


import br.com.fasam.projetoexemplo.entidades.Artigo;
import br.com.fasam.projetoexemplo.entidades.Comentario;
import br.com.fasam.projetoexemplo.entidades.Usuario;
import static junit.framework.Assert.assertNotNull;
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
    
    public void testComentarioNaoNulo(){
 
        Comentario comentario = new Comentario();
        assertNotNull(comentario.getTitulo());
    }   
    public void testDescricaoNaoNula(){
 
        Comentario comentario = new Comentario();
        assertNotNull(comentario.getDescricao());
    } 
}