package homework;

public class MathClass {
 

private double setKey; 
	
	public void halve(double x) {
		System.out.println(x/2);
	}
	
	public void square(int x) {
		System.out.println(x*x);
	}
	
	public void averageFive(double num1, double num2, double n3, double n4, double n5) {
		System.out.println((num1+num2+n3+n4+n5)/5.0);
	}
	
	public void raiseToTheFourth(double num1){
		System.out.println(num1*num1*num1*num1);
	}
	
	public void setKey(double num1) {
		setKey = num1;
	}
	
	public void multiplyByKey(double num1) {
		System.out.println(num1*setKey);
	}
	
	public void keyCubed() {
		System.out.println(setKey*setKey*setKey);
	}
	
	public void makeInteger(double num1) {
		System.out.println((int) num1);
	}
	
	public void roundToNearestWhole(double num1) {
		System.out.println((int)(num1+0.5));
	}
		
	public static void main(String args[]) {
			
			MathClass tester = new MathClass();
			
			tester.halve(8);
			
			tester.square(7);
			
			// output: 7
			tester.averageFive(7,10,5,7,6);
			
			// output: 81
			tester.raiseToTheFourth(3);
			
			// output: nothing, just save the number 4 as an instance variable
			tester.setKey(4);
			
			// output: 28
			tester.multiplyByKey(7);
			
			// output: 64
			tester.keyCubed();
			
			// output: 3
			tester.makeInteger(3.756);
			
			// output: 8
			tester.roundToNearestWhole(7.8);
			
		}
	}