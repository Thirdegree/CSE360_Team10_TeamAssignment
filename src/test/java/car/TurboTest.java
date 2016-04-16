package car;


import static org.junit.Assert.*;

import org.junit.Test;

//Note: This class does not need any other tests because it only inherits the base class.
//We haven't decided if there will be any other methods that we will need to add to this class.
public class TurboTest extends CarPart{
	
	@Test
	public void testTurbo(){
		Turbo turbo = new Turbo();
		assertNotNull(turbo);
	}
}
