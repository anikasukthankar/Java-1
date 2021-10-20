package cw;

import java.util.Scanner;

public class NestedLoops{
	
	public void alphabet() {
		
		for (char i = 'A'; i<= 'Z'; ++i) {
			System.out.print(i+"");
		}
	}
	
	public void multiplicationTable() {
		
		for (int i = 1; i< 13; i++) {
			for (int k = 0; k< 13; k++) {
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
	
		//is there any way to simplify this? it took me a really long time to write!
		
		for(int s=n;s>=1;s--)
	     {
	         for(int h=s;h<n;h++)
	         {
	             System.out.print(" ");
	         }
	         for(int h=1;h<=(2*s-1);h++)
	         {
	 if(h==1 || h==(2*s-1))
	             System.out.print("*");
	 else
	          System.out.print(" ");
	         }
	         System.out.println("");
	     } 
	 for(int s=2;s<=n;s++)
	     {
	         for(int h=s;h<n;h++)
	         {
	             System.out.print(" ");
	         }
	         for(int h=1;h<=(2*s-1);h++)
	         {
	 if(h==1 || h==(2*s-1))
	             System.out.print("*");
	 else
	          System.out.print(" ");
	         }
	         System.out.println("");
	     }                   
	    
	}
	
	public void pascalsT (int n){
		
		//took me FOREVER but I managed to get it :)
		
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
		runner.multiplicationTable();
		//runner.primeNumbers(10);
		//runner.xStar(3);
		//runner.pascalsT(4);    
	}
}