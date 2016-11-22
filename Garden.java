import javax.swing.*;
public class Garden {
	
	/* data */
	JFrame gardenMap; //frame to put drawing on
	// implement map using drawings, TO DO *********
	
	Water gWater; 
	Group North, South, West, East; //four groups
	Temperature realTemperature = new Temperature(); //the system temperature
	
	/* constructor */
	Garden(){
		gWater = new Water();
		North = new Group();
		South = new Group();
		West = new Group();
		East = new Group();
	}
	
	/* methods */
	public Water getWater(){
		return gWater;
	}
	
	public void setTodayG(int usage){
		gWater.setToday(usage*(North.getActive()+South.getActive()+West.getActive()+East.getActive())*5);
		if(realTemperature.getCurrTemp() >= realTemperature.getMaxTemp()){
			//run for extra 5 minutes
			gWater.setToday(5*(North.getActive()+South.getActive()+West.getActive()+East.getActive())*5);
//****		/* need to connect to display to show another 5 minutes */
		}
		if(realTemperature.getCurrTemp() <= realTemperature.getMinTemp()){
			North.turnOff();
			South.turnOff();
			West.turnOff();
			East.turnOff();
		}
	}
	

	
}
