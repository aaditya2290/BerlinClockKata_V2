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

	@Test
	public void testFiveHoursRowAllLampsTurnsOnForHours20to23(){
		assertEquals("RRRR",clock.convertHoursToFiveHoursRow(22));
	}

	@Test
	public void testSingleHoursRowContains4Lamps(){
		assertEquals(4,clock.convertHoursToSingleHoursRow(0).length());
	}

	@Test
	public void testSingleHoursRowFirstLampTurnsOnForHoursEndingWith1or6(){
		assertEquals("ROOO",clock.convertHoursToSingleHoursRow(21));
	}

	@Test
	public void testSingleHoursRowFirstTwoLampsTurnsOnForHoursEndingWith2or7(){
		assertEquals("RROO",clock.convertHoursToSingleHoursRow(7));
	}

	@Test
	public void testSingleHoursRowFirstThreeLampsTurnsOnForHoursEndingWith3or8(){
		assertEquals("RRRO",clock.convertHoursToSingleHoursRow(13));
	}

	@Test
	public void testSingleHoursRowAllLampsTurnsOnForHoursEndingWith4or9(){
		assertEquals("RRRR",clock.convertHoursToSingleHoursRow(4));
	}

	@Test
	public void testFiveMinutesRowContains11Lamps(){
		assertEquals(11,clock.convertMinutesToFiveMinutesRow(0).length());
	}

	@Test
	public void testFiveMinuteRowFirstYellowLampTurnsOnForMinutes5to9(){
		assertEquals("YOOOOOOOOOO",clock.convertMinutesToFiveMinutesRow(8));
	}

	@Test
	public void testFiveMinuteRowSecondYellowLampTurnsOnForMinutes10to14(){
		assertEquals("YYOOOOOOOOO",clock.convertMinutesToFiveMinutesRow(13));
	}
	
	@Test
	public void testFiveMinuteRowThirdRedLampTurnsOnForMinutes15to19(){
		assertEquals("YYROOOOOOOO",clock.convertMinutesToFiveMinutesRow(16));
	}
	
	@Test
	public void testFiveMinuteRowFourthYellowLampTurnsOnForMinutes20to24(){
		assertEquals("YYRYOOOOOOO",clock.convertMinutesToFiveMinutesRow(22));
	}
	
	@Test
	public void testFiveMinuteRowFifthYellowLampTurnsOnForMinutes25to29(){
		assertEquals("YYRYYOOOOOO",clock.convertMinutesToFiveMinutesRow(25));
	}

}
