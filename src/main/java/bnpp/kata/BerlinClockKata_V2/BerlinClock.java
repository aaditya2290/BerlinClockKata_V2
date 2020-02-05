package bnpp.kata.BerlinClockKata_V2;

public class BerlinClock {

	public String[] convertDigitalTimeToBerlinClockTime(String digitalTime){

		return new String[]{"O","OOOO","","",""};
	}

	public String convertSecondsToSecondsLamp(int seconds){
		if (seconds%2==0)
			return "Y";
		else
			return "O";
	}

	public String convertHoursToFiveHoursRow(int hours){

		int onLampsCount=hours/5;
		return convertHourstoBerlinClockHourRows(4,onLampsCount,"R");

	}

	public String convertHoursToSingleHoursRow(int hours){

		int onLampsCount=hours%5;
		return convertHourstoBerlinClockHourRows(4,onLampsCount,"R");

	}

	public String convertMinutesToFiveMinutesRow(int minutes){

		int onLampsCount=minutes/5;
		return convertHourstoBerlinClockHourRows(11,onLampsCount,"Y");
	}

	public String convertMinutesToSingleMinutesRow(int minutes){

		int onLampsCount=minutes%5;
		return convertHourstoBerlinClockHourRows(4,onLampsCount,"Y");

	}

	public String convertHourstoBerlinClockHourRows(int lampsCount,int onLampsCount,String onLampDisplay){

		String result="";
		for (int i=0;i<lampsCount;i++)
			if (i<onLampsCount)
			{
				if (lampsCount==11 && isOnLampRed(i))
					result+="R";
				else
					result+=onLampDisplay;
			}
			else
				result+="O";
		return result;

	}

	public boolean isOnLampRed(int index){

		return (index+1)%3==0;


	}

}
