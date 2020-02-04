package bnpp.kata.BerlinClockKata_V2;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds){
		if (seconds%2==0)
			return "Y";
		else
			return "O";
	}

	public String convertHoursToFiveHoursRow(int hours){

		if (hours>=5 && hours<=9)
			return "ROOO";
		else
			if (hours>=10 && hours<=14)
				return "RROO";
			else
				if (hours>=15 && hours<=19)
					return "RRRO";	
				else
					return "OOOO";
	}

}
