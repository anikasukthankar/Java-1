package cw;


public class readingloops{
	
	public void Loops() {
		int num1 = 1, num2 = 0, num3 = 1; 
		   
		  while (num1 <= 50) { 
		   num3 = num1; 
		   num1 = num2 + num1; 
		   num2 = num3; 
		   System.out.println(num2); 
		  } 
	}
	
	public static void main(String [] args) {
		
		readingloops runner = new readingloops();
		
		runner.Loops();

	}

}