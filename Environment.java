package sourceSystem;

import java.util.Calendar;
import java.lang.*;

public class Environment {

	/* data */

	private int[] waterUse = new int[7]; // water data SUN = 0 SAT = 6
	private int currTemp, minTemp, maxTemp; // temperature data
	private Garden realGarden = new Garden(); //only instance of Garden
	private Schedule realSchedule = new Schedule(); // only instance of Schedule
	
	/* constructor */

	Environment() {
		for (int i = 0; i < 7; i++) {
			waterUse[i] = 0;
		}
		currTemp = 70;
		minTemp = 32;
		maxTemp = 100;

	}

	/* methods */
	
	//turn on system via schedule
	public void systemRun() throws Exception {
		int heatRunCount = 0;
		while(true){
			Thread.sleep(2000); //check every two seconds
			int day = realSchedule.getDayOfWeek();
			int startTime = realSchedule.getTimeStart(day);
			int finishTime = realSchedule.getTimeFinish(day);
			int currTime = realSchedule.getMinuteTime();
			if(currTime < 1){ //reset heat checker for each day
				heatRunCount = 0;
			}
			int numActive = 0;
			if(currTemp < minTemp){
				continue;
			}
			if(startTime < currTime && finishTime > currTime){
				if(realGarden.noSet[day]){
					realGarden.getNorth().turnOn();
				}
				if(realGarden.soSet[day]){
					realGarden.getSouth().turnOn();
				}
				if(realGarden.weSet[day]){
					realGarden.getWest().turnOn();
				}
				if(realGarden.eaSet[day]){
					realGarden.getEast().turnOn();
				}
				numActive = realGarden.getActive();
				waterUse[day]+=(numActive*(1/6)); // add amount of water used in those two seconds
				continue;
			}
			
			if(currTemp > maxTemp && heatRunCount < 150){
				if(realGarden.noSet[day]){
					realGarden.getNorth().turnOn();
				}
				if(realGarden.soSet[day]){
					realGarden.getSouth().turnOn();
				}
				if(realGarden.weSet[day]){
					realGarden.getWest().turnOn();
				}
				if(realGarden.eaSet[day]){
					realGarden.getEast().turnOn();
				}
				numActive = realGarden.getActive();
				waterUse[day]+=(numActive*(1/6)); // add amount of water used in those two seconds
				heatRunCount++;
				continue;
			}
			if(finishTime < currTime){
				realGarden.getNorth().turnOff();
				realGarden.getSouth().turnOff();
				realGarden.getWest().turnOff();
				realGarden.getEast().turnOff();
			}
		}
	}
	
	// shut down every sprinkler
	public void systemShutDown(){
		realGarden.turnOff();
	}

	// smurfing data to provide values for graph
	public void smurfWater() {
		waterUse[0] = 1200; // watered for 15 min
		waterUse[1] = 2400; // watered for 30 min
		waterUse[2] = 800; // watered for 10 min
		waterUse[3] = 1200; // watered fro 15 min
		waterUse[4] = 2800; // watered for 30min + 5min heat check
		waterUse[5] = 1200; // watered for 15 min
		waterUse[6] = 800; // wateredfor 10 min
	}

	// setters for temp

	public void setCurrTemp(int t) {
		currTemp = t;
	}

	public void setMinTemp(int t) {
		minTemp = t;
	}

	public void setMaxTemp(int t) {
		maxTemp = t;
	}

	// getters for temp

	public int getCurrTemp() {
		return currTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}
}
