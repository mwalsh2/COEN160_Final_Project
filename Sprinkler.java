
public class Sprinkler {
	/* data */
	private boolean active, working; //status of sprinkler
	
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
