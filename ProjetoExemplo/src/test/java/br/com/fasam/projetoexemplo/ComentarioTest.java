/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;


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
    
    public void testComentario(String titulo, String descricao, String usuario, String artigo){
       assertNotNull(titulo);
       assertNotNull(descricao);
       assertNotNull(usuario);
       assertNotNull(artigo);
    }
}
