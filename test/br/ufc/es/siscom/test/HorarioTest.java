
import  static org.mockito.Mockito.mock;
import  static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



import br.ufc.es.siscom.controller.HorarioController;

public class HorarioTest {
	HorarioController horarioCtrl;
	
	@Before
	public void create() {
		horarioCtrl = mock(HorarioController.class);
		when(horarioCtrl.salvar()).thenReturn("monitorInicial.xhtml");
	}
	
	@Test
	public void testSalvaHorario(){
		assertEquals("monitorInicial.xhtml", horarioCtrl.salvar());
	}

}
