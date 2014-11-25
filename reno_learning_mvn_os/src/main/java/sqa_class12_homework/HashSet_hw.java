package sqa_class12_homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//1.	HashSet
//a.	Create a class with main method.
//b.	Define a method hashSetSample()
//c.	Create object of this class inside main method and call hashSetSample() method.
//d.	This method should create 10 objects of circle class. 2 of the object have radius = 5; 1 object = null and remaining 7 have different objects.



public class HashSet_hw {

	public static void main(String[] args) {
		HashSet_hw hshw = new HashSet_hw();
		Set <Circle> hscir = hshw.hashSetSanple();
		
		for(Circle cir: hscir){
			System.out.println("The element in set is: "+cir.getRadius());
		}
		
		Iterator <Circle> it = hscir.iterator();
		while(it.hasNext()){
			System.out.println("The elelment in set is: "+it.next().getRadius());
		}

	}
	
	private class Circle{
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
		private HashSet_hw getOuterType() {
			return HashSet_hw.this;
		}
	
	}
	
	public Set hashSetSanple(){
		Set <Circle> hs = new HashSet<Circle>();
		hs.add(new Circle(3));
		hs.add(new Circle(4));
		hs.add(new Circle(3));
		hs.add(new Circle(3));
		hs.add(new Circle(3));
		hs.add(new Circle(5));
		hs.add(new Circle(6));
		hs.add(new Circle(7));
		hs.add(new Circle(8));
		
		return hs;
	}

}
