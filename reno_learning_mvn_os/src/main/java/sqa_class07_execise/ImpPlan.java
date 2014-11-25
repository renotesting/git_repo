package sqa_class07_execise;

public class ImpPlan implements IFlyingObject {
	
	public ImpPlan(){
		System.out.println("The plan information is");
		System.out.println("	The plan max speed is "+maxSpeed);
		System.out.println("	The plan maxAltitude is"+maxAltitude);
		
	}
	
//	@Override
	public boolean takeOff(String instruction) {
		if (instruction == "takeoff") {
			System.out.println("Received instraction: " + instruction);
			return true;
		} else {
			System.out.println("Received instraction: " + instruction+ "we are not taking off this time.");
			return false;
		}
	}

//	@Override
	public boolean land(String instruction){
		if (instruction == "landing") {
			System.out.println("Received instraction: " + instruction);
			return true;
		} else {
			System.out.println("Received instraction: " + instruction + " we are not landing this time.");
			return false;
		}
	}

//	@Override
	public void capacity(int numOfpassenger){
		System.out.println("This plan's capacity is " + numOfpassenger);
		
	}

//	@Override
	public boolean flyHigh(int Altitude){
		if (Altitude <= maxAltitude) {
			System.out.println("Received instraction of fly altitude: " + Altitude);
			return true;
		} else {
			System.out.println("Received instraction of fly altitude is not valide: " + Altitude);
			return false;
		}
		
	}
}
