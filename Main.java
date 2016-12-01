package sourceSystem;
import java.util.*;
import javax.swing.*;

import javax.swing.SwingUtilities;
public class Main {
	public static void main(String[] args) {
		

		Environment realEnvironment = new Environment();
		
		/*Initiate program*/
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Display();
			}
		});
	}
}