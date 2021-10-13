package cw;

import java.util.Scanner;

public class IntroLoops{
	
	Scanner in = new Scanner(System.in);
	
	//definite finite
	public void twoIntegers(int x, int y){
		
		if (x <= y) {
			while (x <= y) {
				System.out.println(x);
				x+=1;
			}
		}
		
		else if (x >= y) {
			while (y <= x) {
				System.out.println(y);
				y+=1;
			}
		}
		
	}
	
	//definite finite
	public void baseCoefficients(double base, double coefficient) {
		
		int x = 0;
		
		while ( x <= 5) {
			
			
			System.out.println(coefficient*(Math.pow(base, x)));
			x+=1;
		}
		
	}
		
	//definite finite
	public void squareRoot(int num1) {
		
		int x = 1;
		int num = -1;
		
		while (x < num1) {
			if (x*x == num1) {
				System.out.println(x);
				
				num = num1;
			}
			x+=1;
		}
		if (num < 0) {
			System.out.println("No square root");
		}
	}
	
	
	//indefinite
	
	public void largestInteger() {
		System.out.println("Enter a number");
	    
		int n = in.nextInt();
		int i = 0;
		int highest = 0;
		int curr = 0;
		
		while (i < n) {
			System.out.println("Enter another number");
			curr = in.nextInt();
			
			if (curr > highest) {
				highest = curr;
			}
			
			i++;
		}
		
		System.out.println("Highest number:" + highest);
	}
		
	
	public static void main(String[] args) {
		IntroLoops runner = new IntroLoops();
		
		runner.twoIntegers(3, 7);
		runner.baseCoefficients(2, 3);
		runner.squareRoot(49);
		runner.largestInteger();
	}
	
}