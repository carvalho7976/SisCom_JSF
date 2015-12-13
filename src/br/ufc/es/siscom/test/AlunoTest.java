package br.ufc.es.siscom.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import br.ufc.es.siscom.controller.AlunoController;

public class AlunoTest {

  private AlunoController alunoCtrl;

  @Before
  public void create() {
    alunoCtrl = mock(AlunoController.class);
    when(alunoCtrl.atualizarAluno()).thenReturn("listarAlunos.xhtml");

  }

  @Test
  public  void testAlunoCntrAtualizar() {
    assertEquals("listarAlunos.xhtml", alunoCtrl.atualizarAluno());
  }

  /*
   * @Test(expected= Exception.class) public void testExecptionAddAluno(){
   * alunoDao.adicionarAluno(aluno); }
   */
  /*
   * @Test(expected=IllegalArgumentException.class) public void
   * testExecptionBuscarAlunoPorOrientador(){ alunoDao.retornarTodosAlunosNaoMonitores(null); }
   */
  /*
   * @Test public void testNaoOk(){ assertEquals(3,2); }
   */

}
