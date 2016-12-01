import javax.swing.*;
public class Garden {
	
	/* data */	
	Group North, South, West, East; //four groups
	
	/* constructor */
	Garden(){
		North = new Group();
		South = new Group();
		West = new Group();
		East = new Group();
	}
	
	public void turnOff(){
		North.turnOff();
		South.turnOff();
		West.turnOff();
		East.turnOff();
	}
	
}

//	/* methods */
//	public Water getWater(){
//		return gWater;
//	}
//	
//	/*usage is in minutes */
//	public void setTodayG(int runTime, int startTime){
//		for (int i = startTime ; i < runTime + startTime ; i++){
//			if (realTemperature.getCurrTemp() <= realTemperature.getMinTemp()){
//				North.turnOff();
//				South.turnOff();
//				West.turnOff();
//				East.turnOff();
//				break;
//			}
//			if ()
//		}
//	}
//	
//	
//	
//	public void setTodayG(int usage){
//		gWater.setToday(usage*(North.getActive()+South.getActive()+West.getActive()+East.getActive())*5);
//		if(realTemperature.getCurrTemp() >= realTemperature.getMaxTemp()){
//			//run for extra 5 minutes
//			gWater.setToday(5*(North.getActive()+South.getActive()+West.getActive()+East.getActive())*5);
////****		/* need to connect to display to show another 5 minutes */
//		}
//		if(realTemperature.getCurrTemp() <= realTemperature.getMinTemp()){
//			North.turnOff();
//			South.turnOff();
//			West.turnOff();
//			East.turnOff();
//			gWater.setToday(); //repalce 0 with water use based on difference from current time till time supposed to end
//		}
//	}
//	
//	public int timeDiff (){
//		Time tempTime = new Time();
//		int currTime = tempTime.getMinuteTime();
//		int endTime = getTimeStart() + getTimeRun();
//		int timeDiffTemp = endTime - currTime;
//		return timeDiffTemp;
//	}
//	
//}
