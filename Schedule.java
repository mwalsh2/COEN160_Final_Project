import java.util.Calendar;

import javax.swing.*;

public class Schedule {
	/* data */
	private JButton monOn, tueOn, wedOn, thuOn, friOn, satOn, sunOn; // turn on that day
	private JComboBox monStart, tueStart, wedStart, thuStart, friStart, satStart, sunStart; // start time
	private JComboBox monTime, tueTime, wedTime, thuTime, friTime, satTime, sunTime; // time to run
	private JCheckBox monG1, monG2, monG3, monG4, tueG1, tueG2, tueG3, tueG4, wedG1, wedG2, wedG3, wedG4, thuG1, thuG2,
			thuG3, thuG4, friG1, friG2, friG3, friG4, satG1, satG2, satG3, satG4, sunG1, sunG2, sunG3, sunG4; //group buttons
	private JLabel monFor, tueFor, wedFor, thuFor, friFor, satFor, sunFor; //to say "for" between comboboxes
	private JLabel monMin, tueMin, wedMin, thuMin, friMin, satMin, sunMin; //to say "minutes" after last combobox
	private JLabel scheduleLabel; //to label the schedule section
	private int monTimeRun, tueTimeRun, wedTimeRun, thuTimeRun, friTimeRun, satTimeRun, sunTimeRun; //length to run water use
	Calendar rightNow = Calendar.getInstance(); //use to work with time
	int DayOfWeek = rightNow.get(rightNow.DAY_OF_WEEK); //get the day of the week
	
	/* constructor */
	
	Schedule(){
		sunTimeRun = 0;
		monTimeRun = 0;
		tueTimeRun = 0;
		wedTimeRun = 0;
		thuTimeRun = 0;
		friTimeRun = 0;
		satTimeRun = 0;
	}
	
	/* methods */
	
	// pass out the time it is scheduled to run
	public int getTimeRun(){
		if(DayOfWeek == 1)
			return sunTimeRun;
		if(DayOfWeek == 2)
			return monTimeRun;
		if(DayOfWeek == 3)
			return tueTimeRun;
		if(DayOfWeek == 4)
			return wedTimeRun;
		if(DayOfWeek == 5)
			return thuTimeRun;
		if(DayOfWeek == 6)
			return friTimeRun;
		if(DayOfWeek == 7)
			return satTimeRun;
		return 0;
	}
}
