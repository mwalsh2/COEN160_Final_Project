
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame {
	// Declarations
	JTextField heightFtFld, heightInFld, weightFld;
	JLabel graphLab, mapLab, schedLab, tempLab, manualLab, systemLab;
	JButton calculateButton;
	JPanel graphPan, mapPan, schedPan, tempPan, manualPan, systemPan;

	// Constructor
	public MainFrame() {
		super("Home Sprinkler System");
		setSize(800, 800);

		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 2));

		/* Panel instantiations */
		graphPan = new JPanel();
		mapPan = new GardenPanel();
		schedPan = new SchedulePanel();
		tempPan = new TempPanel();
		manualPan = new JPanel();
		systemPan = new JPanel();

		/* Label Instantiations */
		graphLab = new JLabel("Water Usage Graph");
		
		
		
		manualLab = new JLabel("Manual Control Switch");
		systemLab = new JLabel("System On/Off");
	
		/* Add Labels to panels */
		graphPan.add(graphLab);
		//schedPan.add(schedLab);
		manualPan.add(manualLab);
		systemPan.add(systemLab);
		//tempPan.add(manualPan);
		//tempPan.add(systemPan);

		/* Add panels to container */
		container.add(graphPan);
		container.add(mapPan);
		container.add(schedPan);
		container.add(tempPan);
		

		// show the frame in the center of the screen
		setLocationRelativeTo(null);
		setVisible(true);

	}

	

}


class SchedulePanel extends JPanel{
	DayPanel sundayPan, mondayPan, tuesdayPan, wenedsdayPan, thursdayPan, fridayPan, saturdayPan;
	JLabel schedLab;
	
	SchedulePanel(){
		setLayout(new GridLayout(7,0));
		schedLab = new JLabel("Weekly Schedule");
		
		
		sundayPan = new DayPanel("Sunday");
		mondayPan = new DayPanel("Monday");
		tuesdayPan = new DayPanel("Tuesday");
		wenedsdayPan = new DayPanel("Wednesday");
		thursdayPan = new DayPanel("Thursday");
		fridayPan = new DayPanel("Friday");
		saturdayPan = new DayPanel("Saturday");
		
		
		
	}
	
	public class DayPanel {
		String[] startTimeStrings = new String[] {"5:15", "5:30", "5:45", "6:00", "6:15", "6:30"};
		String[] stopTimeStrings = new String[] {"5:15", "5:30", "5:45", "6:00", "6:15", "6:30"};
		JComboBox <String> startTimeBox, stopTimeBox;
		JCheckBox North, South, East, West, On;
		JLabel schedDay; 
		JButton manualSwitch;
		
		DayPanel(String nameDay){
			setLayout(new FlowLayout());
			startTimeBox = new JComboBox<String> (startTimeStrings); 
			stopTimeBox = new JComboBox<String> (stopTimeStrings);
			North = new JCheckBox();
			South = new JCheckBox();
			East = new JCheckBox();
			West = new JCheckBox();
			On = new JCheckBox();
			schedDay = new JLabel(nameDay);
			manualSwitch = new JButton();
			
			add(schedDay);
			add(On);
			add(startTimeBox);
			add(stopTimeBox);
			add(North);
			add(South);
			add(West);
			add(East);
			add(manualSwitch);
		}
	}
}


class TempPanel extends JPanel{
	JLabel minLabel, maxLabel, currLabel, tempLabel;
	JButton incButton, decButton;
	JPanel panel1, panel2;
	
	TempPanel (){
		setLayout(new BorderLayout());
		setBackground(Color.YELLOW);
		minLabel = new JLabel("Minimum Temperature");
		maxLabel = new JLabel("Maximum Temperature");
		currLabel = new JLabel("Current Temperature");
		tempLabel = new JLabel("Temperature Control");
		incButton = new JButton("Increase");
		decButton = new JButton("Decrease");
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		
		
		panel1.add(minLabel);
		panel1.add(maxLabel);
		panel1.add(tempLabel);
		
		panel2.add(decButton, BorderLayout.WEST);
		panel2.add(currLabel, BorderLayout.CENTER);
		panel2.add(incButton, BorderLayout.EAST);
		
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
	}
}

class GardenPanel extends JPanel{
	JButton N1, N2, N3, N4,
		E1, E2, E3, E4,
		S1, S2, S3, S4,
		W1, W2, W3, W4;
	JPanel gardenN, gardenE, gardenS, gardenW;
	JLabel mapLabel;
	
	GardenPanel(){
		setLayout(new BorderLayout());
		setBackground(Color.GREEN);
		mapLabel = new JLabel("Garden Map");
		add(mapLabel);
		N1 = new JButton();
		N1.setPreferredSize(new Dimension(20, 20));
		N2 = new JButton();
		N2.setPreferredSize(new Dimension(20, 20));
		N3 = new JButton();
		N3.setPreferredSize(new Dimension(20, 20));
		N4 = new JButton();
		N4.setPreferredSize(new Dimension(20, 20));
		E1 = new JButton();
		E1.setBounds(80, 80, 80, 80);
		E2 = new JButton();
		E2.setBounds(80, 80, 80, 80);
		E3 = new JButton();
		E3.setBounds(80, 80, 80, 80);
		E4 = new JButton();
		E4.setBounds(80, 80, 80, 80);
		S1 = new JButton();
		S1.setBounds(80, 80, 80, 80);
		S2 = new JButton();
		S2.setBounds(80, 80, 80, 80);
		S3 = new JButton();
		S3.setBounds(80, 80, 80, 80);
		S4 = new JButton();
		S4.setBounds(80, 80, 80, 80);
		W1 = new JButton();
		W1.setBounds(80, 80, 80, 80);
		W2 = new JButton();
		W2.setBounds(80, 80, 80, 80);
		W3 = new JButton();
		W3.setBounds(80, 80, 80, 80);
		W4 = new JButton();
		W4.setBounds(80, 80, 80, 80);
		
		gardenN = new JPanel();
		gardenN.setLayout(new BorderLayout());
		gardenS = new JPanel();
		gardenS.setLayout(new BorderLayout());
		gardenW = new JPanel();
		gardenW.setLayout(new BorderLayout());
		gardenE = new JPanel();
		gardenE.setLayout(new BorderLayout());
		
		gardenN.add(N1, BorderLayout.NORTH);
		gardenN.add(N2, BorderLayout.SOUTH);
		gardenN.add(N3, BorderLayout.WEST);
		gardenN.add(N4, BorderLayout.EAST);
		gardenE.add(E1, BorderLayout.NORTH);
		gardenE.add(E2, BorderLayout.SOUTH);
		gardenE.add(E3, BorderLayout.EAST);
		gardenE.add(E4, BorderLayout.WEST);
		gardenS.add(S1, BorderLayout.NORTH);
		gardenS.add(S2, BorderLayout.SOUTH);
		gardenS.add(S3, BorderLayout.WEST);
		gardenS.add(S4, BorderLayout.EAST);
		gardenW.add(W1, BorderLayout.NORTH);
		gardenW.add(W2, BorderLayout.SOUTH);
		gardenW.add(W3, BorderLayout.EAST);
		gardenW.add(W4, BorderLayout.WEST);
		
		
		add(gardenN, BorderLayout.NORTH);
		add(gardenE, BorderLayout.EAST);
		add(gardenS, BorderLayout.SOUTH);
		add(gardenW, BorderLayout.WEST);
		
	}
}
	
public class Exercise4 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});
	}
}
