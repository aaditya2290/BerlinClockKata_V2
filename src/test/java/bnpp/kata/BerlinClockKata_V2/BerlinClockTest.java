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

	@Test
	public void testSecondsLampTurnsOffForOddSeconds(){
		assertEquals("O",clock.convertSecondsToSecondsLamp(17));
	}

	@Test
	public void testFiveHoursRowContains4Lamps(){
		assertEquals(4,clock.convertHoursToFiveHoursRow(0).length());
	}

	@Test
	public void testFiveHoursRowFirstLampTurnsOnForHours5to9(){
		assertEquals("ROOO",clock.convertHoursToFiveHoursRow(7));
	}

	@Test
	public void testFiveHoursRowFirstTwoLampsTurnsOnForHours10to14(){
		assertEquals("RROO",clock.convertHoursToFiveHoursRow(14));
	}

	@Test
	public void testFiveHoursRowFirstThreeLampsTurnsOnForHours15to19(){
		assertEquals("RRRO",clock.convertHoursToFiveHoursRow(15));
	}

}
