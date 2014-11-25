package basic_learning;

public class ComparisonOperators {
	
	public static void main(String args[]){
		int a = 6;
		//int a;
		// a = 6;
		int b = 5;
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);
		boolean gtOrEq = (a>=b);
		boolean lsOrEq = (a<=b);
		
		System.out.println(a+" isEqual "+b+" : "+isEqual);
		System.out.println(a+" isNotEqual "+b+" : "+isNotEqual);
		System.out.println(a+" greaterThan "+b+" : "+greaterThan);
		System.out.println(a+" lessThan "+b+" : "+lessThan);
		System.out.println(a+" gtThanEq "+b+" : "+gtOrEq);
		System.out.println(a+" lsThanEq "+b+" : "+lsOrEq);
		
		boolean orOperator = (false || false || true);
		boolean andOperator = (true && false && false);
		boolean notOperator = !(true);
		
		System.out.println("result of orOperator is : "+orOperator);
		System.out.println("result of andOperator is : "+andOperator);
		System.out.println("result of notOperator is : "+notOperator);
		
	}
}
