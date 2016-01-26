
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import br.ufc.es.siscom.controller.LoginController;

import  static org.mockito.Mockito.mock;
import  static org.mockito.Mockito.when;

public class LoginTest {
	LoginController login;
	
	@Before
	public void create() {
		login = mock(LoginController.class);
		when(login.logout()).thenReturn("/index.xhtml");
	}
	
	@Test
	public void testLogout(){
		assertEquals("/index.xhtml", login.logout());
	}

}
