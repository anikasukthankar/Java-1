package cw;

import java.util.Scanner;

public class nestedLoops{
	
	public void alphabet() {
		
		for (char i = 'A'; i<= 'Z'; ++i) {
			System.out.print(i+"");
		}
	}
	
	public void multiplicationTable() {
		
		for (int i = 0; i< 12; i++) {
			for (int k = 0; k< 12; k++) {
				System.out.println(i*k+ "");
			}
			
			System.out.println();
		}
		
	}
	
	public void primeNumbers(int n) {
		
		for (int i = 1; i <= n; i++) {
		
			boolean divisor = false;
			
			for (int factor = 2; factor <= i/2; factor++){
				
				if(i%factor==0){
                divisor = true;
                break;
            }
        }
			if (!divisor) {
				System.out.println(i++);
			}
	
		}
		
	}
			
	public void xStar(int n) {
		   
		for (int row = 1; row <= 1; row++){
			for (int col = 1; col <= n; col++) {
				System.out.println("*");
				   
		           {
		       
		       }
		   }
		}
	}
	
	
	public static void main(String [] args) {
	
		nestedLoops runner = new nestedLoops();
		
		//runner.alphabet();
		//runner.multiplicationTable();
		//runner.primeNumbers(100);
		runner.xStar(6);
		     
	}
}