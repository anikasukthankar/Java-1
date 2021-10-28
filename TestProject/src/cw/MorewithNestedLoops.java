package cw;

public class MorewithNestedLoops2{
	
	public void xTriangle(int n) {
		 
		for (int i = 1; i<= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void whatPower(int base, int n) {
		
		for (int t = 1, p = base; p <= n; t++) {
			if (p == n) {
				System.out.println(t);
			}
			
			p*=base;
		}
	}
		
	
	public static void main(String [] args) {
	
		MorewithNestedLoops2 runner = new MorewithNestedLoops2();
		
		//runner.xTriangle(4);
		runner.whatPower(3, 27);

	}
}
