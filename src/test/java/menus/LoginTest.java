package menus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

	@Test
	public void testUserLoggedInWithForm() {
		Login loginForm = new Login();
		
		loginForm.displayForm();
		
		assertNotNull(loginForm.getUserProfile());
	}
	
	@Test
	public void testUserRequestedNewProfile() {
		fail("Not yet implemented");
	}

}
