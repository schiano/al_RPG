package tests;

import static org.junit.Assert.*;
import game.*;

import org.junit.Before;
import org.junit.Test;

public class SoldierTest {
	
	private Soldier s1, s2;

	@Before
	public void setUp() throws Exception {
		s1 = new Horseman(150, 50);
		s2 = new Infantryman(100, 25);
	}

	@Test
	public void testStrike() {
		assertEquals(25, s2.strike());
	}

	@Test
	public void testParry() {
		s1.parry(s2.strike());
		
		assertEquals(150-25, s1.getHealth());
	}
	
	@Test
	public void testSword() {
		s2 = EquipmentFactory.createSword(s2, 175);
		assertEquals(200, s2.strike());
	}
	
	@Test
	public void testShield() {
		s1 = EquipmentFactory.createShield(s1, 50);
		s1.parry(s2.strike());
		assertEquals(150, s1.getHealth());
	}

}
