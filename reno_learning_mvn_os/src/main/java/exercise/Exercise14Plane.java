package exercise;

public class Exercise14Plane implements Exercise14IFlyingObject {
	
	private int currentAlt = 0;
	
//	@Override
	public void takeOff() {
		System.out.println("Plane taking off now");
	}

//	@Override
	public void land() {
		System.out.println("Plane landing now");

	}

//	@Override
	public int capacity() {
		return 50;
	}

	public int currentAltitude(){
		return currentAlt;
	}
	
//	@Override
	public int flyHigh() {
		currentAlt += 10000;
		System.out.println("Plane flying at : "+currentAlt+" now");
		return currentAlt;
	}

}
