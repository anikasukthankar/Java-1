package cw;

public class SimpleIf{
	
	public void positiveInteger(int x) {
		if (x>0) {
			System.out.println("Yes!");
			
		}
		
		else if (x<0){
			System.out.print("No!");
			System.out.println();
			
		}
		
		else {
			System.out.print("Neither! It's a zero!");
			System.out.println();

		}	
	}
	
	{}
	
	public void evenOdd(int y) {
		if (y%2==0) {
			System.out.println("It's even!");
		}
		
		else {
			System.out.println("It's odd!");
			
			}
		
	}
		
	public void whatCharacter(int x) {
		if ( x >= 'a' && x <= 'z') {
			System.out.println("It's lowercase!");
		}
		
		else if 
			(x >= 'A' && x <= 'Z') {
			System.out.println("It's uppercase!");
		}
		
		else {
			System.out.println("It's neither!");
		}
	}
	
	public void integer(double num1) {
		if (num1 % 10 == 0) {
			System.out.println("It's a multiple of 10!");
		}
		
		else {
			System.out.println("It's not a multiple of 10");
		}
	
	}

	
	public void doubles(double a, double b, double c) {
		if (a >= b && a >= c) {
			System.out.println("The 1st number is the largest!");
		}
		
		else if (b>=a && b>=c) {
			System.out.println("The 2nd number is the largest!");
		}
		else {
			System.out.println("The 3rd number is the largest!");
		}
		
	}
	
	 
{
	//A method that takes as parameter an integer, and determines if it is positive. If positive, print "yes", otherwise print "no".
	//A method that takes an integer as parameter, and determines if it is even or odd. (Use one of your 5 operators to do this easily)
	//A method that takes a character as parameter, and determines if it is uppercase, lowercase, or neither. 
	//A method that takes an integer as parameter, and determines if it is a multiple of 10.
	//A method that takes three doubles as parameters, and prints out the biggest of the three (this is a maximum function).
	
}


public static void main(String args[]) {
	
	SimpleIf tester = new SimpleIf();
	
		tester.positiveInteger(1);
		
		tester.evenOdd(7);
	
		tester.whatCharacter('B');
	
		tester.integer(36);
		
		tester.doubles(37, 67, 59);
	
	}
}
