import java.util.*;
import javax.swing.*;

import javax.swing.SwingUtilities;
public class Main {
	public static void main(String[] args) {
		
		
		/* put display in here */

		Garden realGarden = new Garden();
		Schedule realSchedule = new Schedule();
		Water realWater = new Water();
		Temperature realTemperature = new Temperature();
		
		/*Initiate program*/
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Display();
			}
		});
	}
}