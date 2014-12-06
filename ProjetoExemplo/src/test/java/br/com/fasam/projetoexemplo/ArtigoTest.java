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
 * @author Pedro henrique alves
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
    /**
     * @return  teste de usuario em artigo
     */
      public void testUsuarioEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getUsuario());
       assertNotNull(artigo.getTitulo());
   }
     /**
     * @return  teste de titulo em artigo
     */
       public void testTituloEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getTitulo());
   }
         /**
     * @return  teste de descricao em artigo
     */
       public void testDescricaoEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getDescricao());
   }
         /**
     * @return  teste de tag em artigo
     */
       public void testTagEmArtigo(){
       Artigo artigo = new Artigo(new Usuario());
       assertNotNull(artigo.getTag(0));
   }
}
