package br.ufc.es.siscom.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufc.es.siscom.controller.MonitorController;

import  static org.mockito.Mockito.mock;
import  static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

public class MonitorTest {
	MonitorController monitor;
	
	@Before
	public void create() {
		monitor = mock(MonitorController.class);
		when(monitor.adicionarDisciplinas()).thenReturn("orientadorInicial.xhtml");
	}
	
	@Test
	public void testCadastrarDisciplina(){
		assertEquals("orientadorInicial.xhtml", monitor.adicionarDisciplinas());
	}

}
