import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		/* put display in here */
		
		Garden realGarden = new Garden();
		Schedule realSchedule = new Schedule();
		
		//pass to garden setter the amount of time scheduled to run
		realGarden.setTodayG(realSchedule.getTimeRun());
		
		/* update water ever 24 hours */
		Timer timer = new Timer ();
		TimerTask dailyTask = new TimerTask () {
		    @Override
		    public void run () {
		        realGarden.getWater().slideWaterUse();
		    }
		};
		// schedule the task to run starting now and then every day
		timer.schedule(dailyTask, 1000*60*60*24, 1000*60*60*24);
		/* *** */
	}
}