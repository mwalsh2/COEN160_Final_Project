import java.util.Calendar;

import javax.swing.*;

public class Schedule {
	/* data */
	private int [] TimeRun = new int [7]; /* 0 is Sunday, 6 is Saturday */
	private int [] TimeStart = new int [7];  /* 0 is Sunday, 6 is Saturday */
	
	/* constructor */
	Schedule(){
		for(int i = 0; i < 7; i++){
			TimeRun[i] = 0;
			TimeStart[i] = 0;
		}
	}
	
	/* methods */
	
	/* returns day of week */
	public int getDayOfWeek(){
		Calendar calGetDay = Calendar.getInstance(); 
		int day = calGetDay.get(Calendar.DAY_OF_WEEK);
		return day; //note: subtract one for spot in array i.e. Wednesday = 4, so would be TimeRun[3]
	}
		
	/* returns current time in minutes since midnight*/
	public int getMinuteTime (){
		long currentTime;
		Calendar tempCal = Calendar.getInstance();
		currentTime = tempCal.getTimeInMillis();
			
		currentTime = currentTime / 60000;
			
		return (int) currentTime % 1440;
	}
	
	// get run time for a daty passed in (SUN = 0)
	public int getTimeRun(int day){
		return TimeRun[day]; 
	}
	
	// get start time for a day passed in (SUN = 0)
	public int getTimeStart(int day){
		return TimeStart[day];
	}
    
	// set run time for a day passed in (SUN = 0)
	public void setTimeRun(int day, int timeR){
		TimeRun[day] = timeR;
	}
	
	// set start time for a day passed in (SUN = 0)
	public void setTimeStart(int day, int timeS){
		TimeStart[day] = timeS;
	}
}
