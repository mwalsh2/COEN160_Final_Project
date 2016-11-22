
public class Sprinkler {
	/* data */
	private boolean active, working; //status of sprinkler
	
	/* constructor */
	Sprinkler (){
		active = false; 
		working = true;
	}
	
	Sprinkler (boolean setting, boolean settingW){
		active = setting;
		working = settingW;
	}
	
	Sprinkler (boolean notWorking){
		working = notWorking;
		active = false; 
	}
	
	/* methods */
	public void setActive (boolean setting){
		active = setting;
	}
	
	public void setWorking (boolean settingW){
		working = settingW;
	}
	
	public boolean getActive (){
		return active;
	}
	
	public boolean getWorking (){
		return working;
	}
}
