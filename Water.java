import java.util.Calendar;

/* sunday = 1 saturday = 7 */

/* assume 5 gal per sprinkler per minute */

public class Water {
	/* data */
	// MAKE AN ARRAY 
	private int day7, day6, day5, day4, day3, day2, today; //day by day water -> day7 is 7 days ago
	Calendar rightNow = Calendar.getInstance(); //use to work with time
	int DayOfWeek = rightNow.get(rightNow.DAY_OF_WEEK); //get the day of the week
	
	// smurfing data to provide values for graph
	Water(){
		day7 = 2400; //all sprinklers active for 30 min
		day6 = 1200; //watered for 15 min
		day5 = 1200; //watered for 15 min
		day4 = 1200; //watered fro 15 min
		day3 = 2800; //watered for 30min + 5min heat check
		day2 = 1200; //watered for 15 min
		today = 0; //will be updated as sprinklers go
	}
	
	/* methods */
	public void slideWaterUse(){
		day7 = day6;
		day6 = day5;
		day5 = day4;
		day4 = day3;
		day3 = day2;
		day2 = today;
		today = 0;
	}
	
	//add the amount of water used
	public void setToday(int temp){
		today += temp;
	}
}
