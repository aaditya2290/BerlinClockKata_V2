package bnpp.kata.BerlinClockKata_V2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

	BerlinClock clock;

	@Before
	public void initilizeBerlinClock() {
		clock=new BerlinClock();

	}

	@Test
	public void testSecondsLampTurnsOnForEvenSeconds(){
		assertEquals("Y",clock.convertSecondsToSecondsLamp(0));
	}

}
