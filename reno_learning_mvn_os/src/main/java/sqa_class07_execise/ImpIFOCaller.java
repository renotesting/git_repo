package sqa_class07_execise;

public class ImpIFOCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpPlan impifo1 = new ImpPlan();
		
		impifo1.capacity(100);
		impifo1.takeOff("takeoff");
		impifo1.flyHigh(10000);
		impifo1.flyHigh(20001);
		impifo1.land("takeoff");
		impifo1.land("landing");
		
	}

}
