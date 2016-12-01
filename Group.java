
public class Group {
	/* data */
	private Sprinkler s1, s2, s3, s4;

	//default constructor 
	Group() {
		s1 = new Sprinkler();
		s2 = new Sprinkler();
		s3 = new Sprinkler();
		s4 = new Sprinkler();
	}
	
	/* methods */
	// turn on sprinklers in group if working
	public void turnOn (){
		boolean active = true;
		if (s1.getWorking())
			s1.setActive(active);
		if (s2.getWorking())
			s2.setActive(active);
		if (s3.getWorking())
			s3.setActive(active);
		if (s4.getWorking())
			s4.setActive(active);
	}
	
	//turns off sprinklers in group
	public void turnOff (){
		boolean active = false;
		s1.setActive(active);
		s2.setActive(active);
		s3.setActive(active);
		s4.setActive(active);
	}
	
	// returns sprinkler number of broken sprinkler in a group
	public int getBroken(){
		if (!s1.getWorking())
			return 1;
		if (!s2.getWorking())
			return 2;
		if (!s3.getWorking())
			return 3;
		if (!s4.getWorking())
			return 4;
		return 0;
	}
	
	// returns number of active sprinklers 
	public int getActive(){
		int count=0; //counts how many sprinklers are on in the group
		if (s1.getActive())
			count++;
		if (s2.getActive())
			count++;
		if (s3.getActive())
			count++;
		if (s4.getActive())
			count++;
		return count;
	}
}