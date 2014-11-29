/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.com.fasam.projetoexemplo.entidades.Artigo;
import br.com.fasam.projetoexemplo.entidades.Usuario;
import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ArtigoTest extends TestCase {
    
    public ArtigoTest(String testName) {
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
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
      public void testUsuarioEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getUsuario());
       assertNotNull(artigo.getTitulo());
   }
       public void testTituloEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getTitulo());
   }
       public void testDescricaoEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getDescricao());
   }
}
