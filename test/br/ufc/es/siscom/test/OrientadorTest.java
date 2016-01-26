
import static org.junit.Assert.*;
import  static org.mockito.Mockito.mock;
import  static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

import br.ufc.es.siscom.controller.OrientadorController;



public class OrientadorTest {
	OrientadorController orientador;
	
	@Before
	public void create() {
		orientador = mock(OrientadorController.class);
		when(orientador.cadastrarOrientador()).thenReturn("listarOrientadores.xhtml");
	}
	
	@Test
	public void testCadastrarOrientador(){
		assertEquals("listarOrientadores.xhtml", orientador.cadastrarOrientador());
	}

}
