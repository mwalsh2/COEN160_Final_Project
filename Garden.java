package sourceSystem;
import javax.swing.*;
public class Garden {
	
	/* data */	
	private Group North, South, West, East; //four groups
	public boolean [] noSet = new boolean[7]; //whether or not set to go each day
	public boolean [] soSet = new boolean[7]; //whether or not set to go each day
	public boolean [] weSet = new boolean[7]; //whether or not set to go each day
	public boolean [] eaSet = new boolean[7]; //whether or not set to go each day
	
	/* constructor */
	Garden(){
		North = new Group();
		South = new Group();
		West = new Group();
		East = new Group();
		for(int i = 0; i < 7; i++){
			noSet[i] = false;
			soSet[i] = false;
			weSet[i] = false;
			eaSet[i] = false;
		}
	}
	
	/* methods */
	
	// turn off all groups
	public void turnOff(){
		North.turnOff();
		South.turnOff();
		West.turnOff();
		East.turnOff();
	}
	
	public Group getNorth(){
		return North;
	}
	
	public Group getSouth(){
		return South;
	}
	
	public Group getEast(){
		return East;
	}
	
	public Group getWest(){
		return West;
	}
	
	//get total number of active sprinklers in system
	public int getActive(){
		int count = 0;
		count+=North.getActive();
		count+=South.getActive();
		count+=East.getActive();
		count+=West.getActive();
		return count;
	}
}

