package homework;

public class sumIt { 
  
	private double one, two, sum;  
	  
	public void setNums(double num1, double num2) {  
		one = num1;
		two = num2;
	}  
	  
	public void sum() {  
		System.out.println(one + two);
	}  
	 
	public void print() {  
		System.out.println();  
	}  
	
	public static void main(String[] args) {  
		sumIt runner = new sumIt();  
		
		// should print out 12  
		runner.setNums(5,  7);  
		runner.sum();  
		System.out.println();  
		
		// should print out 40  
		runner.setNums(13, 27);  
		runner.sum();  
		System.out.println();  
	}
}