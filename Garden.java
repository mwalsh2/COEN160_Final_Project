import javax.swing.*;
public class Garden {
	
	/* data */
	JFrame gardenMap; //frame to put drawing on
	// implement map using drawings, TO DO *********
	
	Water gWater; 
	Group North, South, West, East; //four groups
	
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
	}
	
}
