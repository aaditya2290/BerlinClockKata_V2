package bnpp.kata.BerlinClockKata_V2;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds){
		if (seconds%2==0)
			return "Y";
		else
			return "O";
	}

	public String convertHoursToFiveHoursRow(int hours){

		int onLampsCount=hours/5;
		String result="";
		for (int i=0;i<4;i++)
			if (i<onLampsCount)
				result+="R";
			else
				result+="O";
		return result;

	}

	public String convertHoursToSingleHoursRow(int hours){

		if (hours%5==1)
			return "ROOO";
		else
			if (hours%5==2)
				return "RROO";
			else
				if (hours%5==3)
					return "RRRO";
				else
					if (hours%5==4)
						return "RRRR";
					else
						return "OOOO";
	}

}
