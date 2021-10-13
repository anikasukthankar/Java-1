package cw;

import java.util.Scanner;

public class MoreLoops{
	
private Scanner in = new Scanner(System.in);
	
	//EASY
	//definite finite
	//runtime: linear
	public void negToPos() {
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		for (int i = -num; i <= num; i++) {
			
			System.out.println(i);
		}
		
	}
	
	//easy
	//indefinite
	//runtime: linear
	public void integerHi() {
		System.out.println("Enter a positive number");
		int num = in.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("hi");
			}
		}
	
	//easy
	//indefinite 
	//runtime: linear?
	public void magicNumber() {
		
		int num = 0;
		
		while (num != 8) {
			System.out.println("Enter a number");
			num = in.nextInt();
			
		}
		System.out.println("Magic number!");
	}
				
		
	//medium
	//indefinite
	//runtime: linear
	public void factorial(){
		int n, c, f = 1;

	    System.out.println("Enter a number to find its factorial");
	    

	    n = in.nextInt();

	    if (n < 0)
	      System.out.println("Number should be positive");
	    
	    else{
	      for (c = 1; c <= n; c++)
	        f = f*c;

	      System.out.println(f);
	    }
	
	}
	
	
	//medium
	//indefinite
	//runtime: linear
	public void integerLess() {
		System.out.println("Enter a number");
		int num = in.nextInt();
			
		for (int i = 1; i < num; i++) {
			
			if (num % i == 0) {
				System.out.print(i + ",");
			}
	
		}
	}
	
	
	//hard
	//indefinite
	//runtime: linear
	public void lcMultiple() {
		
		System.out.println("Enter number 1");
		
		int num1 = in.nextInt();
		
		System.out.println("Enter number 2");
		int num2 = in.nextInt();
		
		for (int i = Math.max(num1, num2); i<= num1*num2; i+= i = Math.max(num1, num2)) {
			
			if (i % Math.min(num1, num2) == 0) {
				System.out.println(i);
				break;
			
				}
		}
		
	}
	
	
	public static void main(String[] args) {
	
		MoreLoops runner = new MoreLoops();
		
		//EASY 
		//runner.negToPos();
		//runner.integerHi();
		//runner.magicNumber();
		
		//MEDIUM
		//runner.factorial();
		//runner.integerLess();
		
		//HARD
		runner.lcMultiple();
		
	}
				
	
}
	
	
