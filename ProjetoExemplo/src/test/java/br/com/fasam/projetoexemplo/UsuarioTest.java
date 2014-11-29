/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.com.fasam.projetoexemplo.entidades.Usuario;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class UsuarioTest extends TestCase {
    
    public UsuarioTest(String testName) {
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
    
    public void testNomeUsuarioNaoNulo() {
       
        Usuario usuario = new Usuario();
        assertNotNull(usuario.getNome());
        
    }
    
    public void testSenhaUsuarioNaoNulo() {
       
        Usuario usuario = new Usuario();
        assertNotNull(usuario.getSenha());
        
    }
    
    public void testTelefoneUsuarioNaoNulo() {
       
        Usuario usuario = new Usuario();
        assertNotNull(usuario.getTelefone());
        
    }
    
    public void testCpfUsuarioNaoNulo() {
       
        Usuario usuario = new Usuario();
        assertNotNull(usuario.getCpf());
        
    }
        
    public void testNomeUsuarioIgualPedro() {
       
        Usuario usuario = new Usuario();
        assertEquals(usuario.getNome(), "Pedro");
        
    }
    
    public void testCpfContemOnzeCaracteres() {
       
        Usuario usuario = new Usuario();
        assertEquals(usuario.getCpf().length(), 11);
        
    }
    
    
}
