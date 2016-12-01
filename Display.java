import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display {
	private JButton incCurr, decCurr, incMin, decMin, incMax, decMax; //buttons to edit temps
	private JLabel currT, minT, maxT; //display labels
	private JLabel temperatureLabel; //to label the temperature section
	private JButton monOn, tueOn, wedOn, thuOn, friOn, satOn, sunOn; // turn on that day
	private JComboBox monStart, tueStart, wedStart, thuStart, friStart, satStart, sunStart; // start time
	private JComboBox monTime, tueTime, wedTime, thuTime, friTime, satTime, sunTime; // time to run
	private JCheckBox monG1, monG2, monG3, monG4, tueG1, tueG2, tueG3, tueG4, wedG1, wedG2, wedG3, wedG4, thuG1, thuG2,
			thuG3, thuG4, friG1, friG2, friG3, friG4, satG1, satG2, satG3, satG4, sunG1, sunG2, sunG3, sunG4; //group buttons
	private JLabel monFor, tueFor, wedFor, thuFor, friFor, satFor, sunFor; //to say "for" between comboboxes
	private JLabel monMin, tueMin, wedMin, thuMin, friMin, satMin, sunMin; //to say "minutes" after last combobox
	private JLabel scheduleLabel; //to label the schedule section
	JFrame gardenMap; //frame to put drawing on
	// implement map using drawings, TO DO *********
	
}
