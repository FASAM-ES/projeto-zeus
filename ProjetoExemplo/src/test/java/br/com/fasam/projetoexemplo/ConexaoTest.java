
package br.com.fasam.projetoexemplo;

import br.com.fasam.conexao.Conexao;
import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ConexaoTest extends TestCase {
    
    public ConexaoTest(String testName) {
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

    public void testConexao(){
        Connection con = Conexao.getConexao();
        assertNotNull(con);
    }
}
