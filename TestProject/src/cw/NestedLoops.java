package cw;

import java.util.Scanner;

public class NestedLoops{
	
	
	//runtime: constant
	public void alphabet() {
		
		for (char i = 'A'; i<= 'Z'; ++i) {
			System.out.print(i+"");
		}
	}
	
	
	//runtime: constant
	public void multiplicationTable() {
		
		for (int i = 1; i< 13; i++) {
			for (int k = 0; k< 13; k++) {
				System.out.println(i*k+ "");
			}
			
			System.out.println();
		}
		
	}
	
	
	//runtime: quadratic
	public void primeNumbers(int n) {
		
		for (int j = 2; j<= n; j++) {
			
			boolean divisor = false;
			for (int i = 2; i < j; i++) {
		
			if (j % i == 0) {
                divisor = true;
                break;
            	}
        
			}
		
			if (!divisor) {
				System.out.println(j + "is prime");
				}
	
			}
		
		}
			

	//runtime: quadratic
	public void xStar (int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0 ; j< n; j++) {
				
				if (i == j) 
					System.out.print("*");
				
				else if (i + j == n-1)
					System.out.print("*");
				
				else 
					System.out.print(" ");
			}
			
			System.out.println();
		}	
		
	}
	
	public void pascalsT (int n){
		
		//Not sure where to go from here :(
		
		int p = 1;
	    System.out.print(p);
	     
	    for(int i = 1; i <= n; i++){
	      
	    	int c = (p * (n - i + 1)) / i;
	    	p = c;
	    	System.out.print(", " + c);
	     
	    }
	
	}
	
	public static void main(String [] args) {
	
		NestedLoops runner = new NestedLoops();
		
		//runner.alphabet();
		//runner.multiplicationTable();
		runner.primeNumbers(10);
		//runner.xStar(5);
		//runner.pascalsT(3);    
	}
}