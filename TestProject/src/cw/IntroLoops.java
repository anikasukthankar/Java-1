package cw;

public class IntroLoops{
	
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
	
	public void baseCoefficients(double base, double coefficient) {
		
		int x = 0;
		
		while ( x <= 5) {
			
			
			System.out.println(coefficient*(Math.pow(base, x)));
			x+=1;
		}
		
	}
		
	public void squareRoot(int num1) {
		
		int x = 1;
				
		while (x <= num1) {
			if (num1 % x == 0) {
				System.out.println(num1);
				
				x+=1;
			}
		}
	}
		
	
	public static void main(String[] args) {
		IntroLoops runner = new IntroLoops();
		
		//runner.twoIntegers(3, 7);
		//runner.baseCoefficients(2, 3);
		runner.squareRoot(36);
	}
	
}