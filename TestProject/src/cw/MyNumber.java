package cw;

public class MyNumber {
	
	private char num = 0;
	
	public void charNumber(int input_number) {
		num = (char)input_number;
		System.out.println(num);
		}
	
	public void lastDigit(int input_number) {
		System.out.println(input_number % 10);
		}
	
	public void avg(int input_number,int input_number2) {
		System.out.println((double)(input_number + input_number2)/2.0);
		}
		
	
	public static void main(String[] args) {
		MyNumber runner = new MyNumber();
	
		runner.charNumber(103);
	
		runner.lastDigit(98);
		
		runner.avg(1, 3);
		
		
		}

}






