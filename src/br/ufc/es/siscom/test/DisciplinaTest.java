package br.ufc.es.siscom.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import  static org.mockito.Mockito.mock;
import  static org.mockito.Mockito.when;

import br.ufc.es.siscom.controller.DisciplinaController;

public class DisciplinaTest {
	DisciplinaController disciplina;
	
	
	@Before
	public void create(){
		disciplina = mock(DisciplinaController.class);
		when(disciplina.cadastrarDisciplina()).thenReturn("listarDisciplinas.xhtml");
	}
	
	
	@Test
	public void testCadastrarDisciplina(){
		assertEquals("listarDisciplinas.xhtml", disciplina.cadastrarDisciplina());
		
	}

}
