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
		return convertHourstoBerlinClockHourRows(onLampsCount,"R");

	}

	public String convertHoursToSingleHoursRow(int hours){

		int onLampsCount=hours%5;
		return convertHourstoBerlinClockHourRows(onLampsCount,"R");

	}

	public String convertMinutesToFiveMinutesRow(int minutes){

		int onLampsCount=minutes/5;
		String result="";
		for (int i=0;i<11;i++)
			if (i<onLampsCount)
			{
				if (isOnLampRed(i))
					result+="R";
				else
					result+="Y";	
			}
			else
				result+="O";
		return result;
	}

	public String convertMinutesToSingleMinutesRow(int minutes){

		int onLampsCount=minutes%5;
		return convertHourstoBerlinClockHourRows(onLampsCount,"Y");

	}

	public String convertHourstoBerlinClockHourRows(int onLampsCount,String onLampDisplay){

		String result="";
		for (int i=0;i<4;i++)
			if (i<onLampsCount)
				result+=onLampDisplay;
			else
				result+="O";
		return result;

	}

	public boolean isOnLampRed(int index){

		return (index+1)%3==0;


	}

}
