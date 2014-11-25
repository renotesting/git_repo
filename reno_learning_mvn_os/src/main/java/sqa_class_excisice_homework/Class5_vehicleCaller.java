package sqa_class_excisice_homework;

public class Class5_vehicleCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class5_vehicle cv = new Class5_vehicle();
		cv.setColor("Yellow");
		cv.setMake("1997");
		cv.setModel("Toyota");
		
		System.out.println("cv's color is: "+cv.getColor());
		System.out.println("cv's color is: "+cv.getMake());
		System.out.println("cv's color is: "+cv.getModel());

	}

}
