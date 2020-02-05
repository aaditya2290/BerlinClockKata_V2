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
		return convertHourstoBerlinClockHourRows(hours,onLampsCount);

	}

	public String convertHoursToSingleHoursRow(int hours){

		int onLampsCount=hours%5;
		return convertHourstoBerlinClockHourRows(hours,onLampsCount);

	}

	public String convertMinutesToFiveMinutesRow(int minutes){

		int onLampsCount=minutes/5;
		String result="";
		for (int i=0;i<11;i++)
			if (i<onLampsCount)
			{
				if ((i+1)%3==0)
					result+="R";
				else
					result+="Y";	
			}
			else
				result+="O";
		return result;
	}

	public String convertHourstoBerlinClockHourRows(int hours,int onLampsCount){

		String result="";
		for (int i=0;i<4;i++)
			if (i<onLampsCount)
				result+="R";
			else
				result+="O";
		return result;

	}


}
