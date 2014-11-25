package sqa_class07_execise;

public interface IFlyingObject {
	int maxSpeed = 400;
	int maxAltitude = 20000;
	
	boolean takeOff(String instruction);
	boolean land(String instruction);
	void capacity(int numOfpassenger);
	boolean flyHigh(int altitude);
}
