// Michael Walsh 2016 
import javax.swing.*;
public class Temperature {
	/* data */
	private int currTemp, minTemp, maxTemp; //temperature data
	
	
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
