package exercise;

public class Exercise14Chopper implements Exercise14IFlyingObject {
	
	private int currentAlt;
	
//	@Override
	public void takeOff() {
		System.out.println("Chopper taking off now");
	}

//	@Override
	public void land() {
		System.out.println("Chopper landing now");
	}

//	@Override
	public int capacity() {
		return 5;
	}
	
	public int currentAltitude(){
		return currentAlt;
	}
	
//	@Override
	public int flyHigh() {
		currentAlt += 5000;
		System.out.println("Chopper flying at : "+currentAlt+" now");
		return currentAlt;
	}
}
