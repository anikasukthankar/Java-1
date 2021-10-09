package cw;

public class Booleans3{
	
	public void threeNumbers (int num1, int num2, int num3) {
		if (num2 < num3 && num1 > num2) {
			System.out.println(num2);
			}
		
		else if (num1 < num3 && num2 > num1) {
			System.out.println(num1);
			}
		
		else if (num3 < num2 && num1 > num3) {
			System.out.println(num3); 
			
			}
		}
	
		public void twoCharacters(char c1, char c2) {
			
			c1 = Character.toLowerCase(c1);
			c2 = Character.toLowerCase(c2);
			
			if (Math.abs((int)(c1-c2)) <= 2) {
				System.out.println("True");
			}
			
			
			else {
				System.out.println("False");
			}
			
		}


	public static void main(String[] args) {
		Booleans3 runner = new Booleans3();
		
		runner.threeNumbers(3, 14, 7);
		runner.twoCharacters('H', 'f');
	
		}
	
}
	
	
