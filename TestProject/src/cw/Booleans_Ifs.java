package cw;

import java.util.Scanner;

import homework.LineSlope;

public class Booleans_Ifs{
	
	private Scanner input = new Scanner(System.in);
	
	public void integerParameter(int num0, int num1, int num2, int num3, int num4, int num5) {
		System.out.println(num5*Math.pow(2, 0)+ num4*Math.pow(2, 1) + num3*Math.pow(2, 2)+num2*Math.pow(2, 3) + num1*Math.pow(2, 4)+ num0*Math.pow(2, 5));
		}


	
	public void switchStrings() {
		System.out.println("Enter a string: ");
		String str1 = input.nextLine();
		System.out.println("Enter another string");
		String str2 = input.nextLine();
		
		String str3 = new String();
		str3 = str1;
		str1 = str2;
		str2 = str3;
		
	}
	
	public void fiveDigit(int a) {
		int thous= a%1000;
		int first2=(a-thous)/1000;
		int hunds= a%100;
		int tens=a%10;
		thous=((thous)-(hunds))/100;
		hunds=(hunds-tens)/10;
		System.out.println(first2% thous);
		System.out.println(first2% hunds);
		System.out.println(first2% tens);
	}
	
	public void twoCharacters(char char1, char char2) {
		
		char char3=(char)(char1+char2);
		if (Character.isLetter(char3)) {
			System.out.println(char3);
		}
		
		else {
			
			if ((char1+char2)>= 'z') {
			System.out.println("z");
			
			}
		
			else {
			System.out.println("A");
			}
		}
	}
		

public static void main(String[] args) {
	Booleans_Ifs runner = new Booleans_Ifs();
	
	runner.integerParameter(1, 1, 1, 1, 1, 1);
	//runner.switchStrings();
	runner.twoCharacters('A', '2');
	runner.fiveDigit(34924);
	
	}


}


//Write a method that takes an integer as parameter. 
//Assume this integer will consist of 5 digits. 
//Print the remainder when the first two digits are divided by each of the ones, tens, and hundreds digits. 