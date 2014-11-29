/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.com.fasam.projetoexemplo.entidades.Tag;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class TagTest extends TestCase {
    
    public TagTest(String testName) {
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
    public void testNomeEmTag(){
        Tag tag = new Tag();     
        assertNotNull(tag.getNome());
    }
    public void testDescricaoEmTag(){
        Tag tag = new Tag();
        assertNotNull(tag.getDescricao());
    }
    
}
