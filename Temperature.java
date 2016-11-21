// Michael Walsh 2016 
import javax.swing.*;
public class Temperature {
	/* data */
	private int currTemp, minTemp, maxTemp; //temperature data
	private JButton incCurr, decCurr, incMin, decMin, incMax, decMax; //buttons to edit temps
	private JLabel currT, minT, maxT; //display labels
	private JLabel temperatureLabel; //to label the temperature section
	
	/* constructor */
	Temperature(){
		currTemp = 50;
		minTemp = 32;
		maxTemp = 100;
	}
	
	Temperature(int c, int mi, int ma){
		currTemp = c;
		minTemp = mi;
		maxTemp = ma;
	}
	/* methods */
	
	//setters 
	
	public void setCurrTemp(int t){
		currTemp = t;
	}
	
	public void setMinTemp( int t){
		minTemp = t;
	}
	
	public void setMaxTemp( int t){
		maxTemp = t;
	}
	
	//getters

	public int getCurrTemp(){
		return currTemp;
	}
	
	public int getMinTemp(){
		return minTemp;
	}
	
	public int getMaxTemp(){
		return maxTemp;
	}
	
}
