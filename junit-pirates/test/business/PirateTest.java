package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateCreatetest() {
		Pirate pete = new Pirate ("Pegleg Pete", 3);
		assertEquals(3,pete.getLimbsRemaining());
		assertEquals("Pegleg Pete", pete.getName());
	}

	@Test
	public void octoPirateCreatetest() {
		Pirate pete = new Pirate ("OctoPirate", 8);
		assertEquals(8,pete.getLimbsRemaining());
		
	}
	
	@Test(timeout=10000)
	public void timeoutTest() {
		while (true) {
			
		}
	}
}
