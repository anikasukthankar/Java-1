package homework;

public class sumIt { 
  
	private double one, two, sum;  
	  
	public void setNums(double num1, double num2) {  
		one = num1;
		two = num2;
	}  
	  
	public void sum() {  
		sum = one + two;
	}  
	 
	public void print() {  
		System.out.println(sum);  
	}  
	
	public static void main(String[] args) {  
		sumIt runner = new sumIt();  
		 
		runner.setNums(5,  7);  
		runner.sum();  
		runner.print();  
		 
		runner.setNums(13, 27);  
		runner.sum();  
		runner.print();  
	}
}