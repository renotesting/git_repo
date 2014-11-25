package sqa_class12_homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1.	ArrayList
//a.	Create a class with main method.
//b.	Define a method arrayListSample()
//c.	Create object of this class inside main method and call arrayListSample() method.
//d.	This method should create 10 objects of circle class. 
//		2 of the object have radius = 5; 1 object = null and remaining 7 have different objects.


public class ArrayList_hw {
	public static void main(String[] args){
		ArrayList_hw alhw = new ArrayList_hw();	
		List <Circle> Arrlist = new ArrayList<Circle>();
		Arrlist = alhw.arrayListSample();
		
		for(Circle cr : Arrlist){
			System.out.println("The element in ArrList is: "+ cr.getRadius());
		}
		
		Iterator <Circle> ir = Arrlist.iterator();
		List <Circle> arrList2 = new ArrayList <Circle>();
		while(ir.hasNext()){
			arrList2.add(ir.next());
		}
		
		for(Circle cr : arrList2){
			System.out.println("The element in arrList2 is: "+ cr.getRadius());
		}
		
		alhw.rmDupNul(arrList2);
		
		Iterator <Circle> ir2 = arrList2.iterator();
		while(ir2.hasNext()){
			System.out.println("The element in arrList2 is: "+ir2.next().getRadius());
		}
		
	}
	
	private class Circle{
		private int radius;
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		Circle(int radius){
			this.radius=radius;
		}
		
		public double area(int r){
			double a = 3.14*r*r;
			return a;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + radius;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Circle other = (Circle) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (radius != other.radius)
				return false;
			return true;
		}
		private ArrayList_hw getOuterType() {
			return ArrayList_hw.this;
		}
		
		
	}

	
	public List arrayListSample(){
		List<Circle> al= new ArrayList<Circle>();
		al.add(new Circle(5));
		al.add(new Circle(0));
		al.add(new Circle(3));
		al.add(new Circle(3));
		al.add(new Circle(4));
		al.add(new Circle(5));
		al.add(new Circle(6));
		al.add(new Circle(7));
		
		return al;
	}
	
	public void rmDupNul(List arrl){
//		remove null
		Iterator <Circle> it = arrl.iterator();
		while(it.hasNext()){
			int radius =0;
			if ((radius = it.next().getRadius())==0){
				System.out.println("This elelment is: "+radius+ ", is removed.");
					it.remove();
			}
		}
		
//		remove duplication
		
		
		
	}
	

}
