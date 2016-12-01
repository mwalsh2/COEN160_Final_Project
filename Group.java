package sourceSystem;

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

	public int getActive(){
		int count = 0;
		if(s1.getActive()){
			count++;
		}
		if(s2.getActive()){
			count++;
		}
		if(s3.getActive()){
			count++;
		}
		if(s4.getActive()){
			count++;
		}
		return count;
	}
}