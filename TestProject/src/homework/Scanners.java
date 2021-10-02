package homework;

import java.util.Scanner;

public class Scanners {
	
	private Scanner input = new Scanner(System.in);
		
	public void fourNums() {
		
		System.out.println("Enter a num: ");
		int num1 = input.nextInt();
		System.out.println("Enter another num");
		int num2 = input.nextInt();
		System.out.println("Enter a third num");
		int num3 = input.nextInt();
		System.out.println("Enter a fourth num");
		int num4 = input.nextInt();
		System.out.print(num4+""+num3+""+num2+""+num1);
		
	}
	
	public void mathOperator() {
		System.out.println("Write a mathematical operator!");
		String mathOp = input.next();
		System.out.println("Enter a num: ");
		int num1 = input.nextInt();
		System.out.println("Enter another num: ");
		int num2 = input.nextInt();
		
		if (mathOp.equals("+")) {
			System.out.println(num1 + num2);
		}
		
		else if (mathOp.equals("-")) {
			System.out.println(num1 - num2);
		}
		
		else if (mathOp.equals("*")) {
			System.out.println(num1 * num2);
		}
		
		else if (mathOp.equals("/")) {
			System.out.println(num1/num2);
		}
		
		else if (mathOp.equals("%")) {
			System.out.println(num1%num2);
		}
		
		else {
			System.out.println(mathOp + (char)num1 + (char)num2);
		}
		
	}


	public void greatestDigit() {
		System.out.println("Choose a number between 0 and 999!");
		int num1 = input.nextInt();
		int ones = num1% 10;
		int tens = num1 % 100;
		int hundreds = num1;
	
		tens = tens/10;
		hundreds = hundreds/100;
	
		if (ones > tens && ones > hundreds) {
		System.out.println(ones);
		}
	
		else if (tens > hundreds) {
		System.out.println(tens);
		}
	
		else {
		System.out.println(hundreds);
		}
}
 
	public void football(){
		System.out.println("Choose a number of Touchdowns: ");
		int touchdowns = input.nextInt();
		System.out.println("Choose a number of Field Goals: ");
		int fieldGoals = input.nextInt();
		System.out.println("Choose a number of total points: ");
		int points = input.nextInt();
		
		// can we go over this next class? I have no clue what to do next :(
	}
	
	
	
public static void main(String[] args) {
	Scanners runner = new Scanners();
	
	runner.greatestDigit();
	
	}

}