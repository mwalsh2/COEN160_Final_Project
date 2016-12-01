import java.util.Calendar;

public class Time {
	private long currentTime;
	
	Time(){
		currentTime = 0;
	}
	
	public int getMinuteTime (){
		Calendar tempCal = Calendar.getInstance();
		currentTime = tempCal.getTimeInMillis();
		
		currentTime = currentTime / 60000;
		
		return (int) currentTime % 1440;
		
	}
}
