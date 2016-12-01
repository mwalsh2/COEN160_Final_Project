
public class System {
	/* data */
	private boolean on; //true means system active
	
	/*constructors*/
	System (){
		on = true;
	}
	
	/* methods */
	public void setOff (){
		on = false;
	}
	
	public void setOn (){
		on = true;
	}
	
	public boolean getOn(){
		return on;
	}
}
