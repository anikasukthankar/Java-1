package cw;

public class Human{
	 
	public int age;
	public char gender;
	
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setGender(char gender) {
		this.gender = gender;	
	}
	
	public char getGender() {
		return gender;
	}
	
	public void vote() {
		if (age >= 18) {
			System.out.println("They can vote!");
		}
		
		else {
			System.out.println("They cannot vote");
		}
	
	}
					
	public void tetanus() {
		if (age % 4 == 0) {
			System.out.println("They need their tetanus shot!");
			
		}
		
		else {
			System.out.println("They do not need their tetanus shot");
		}
	}
	
	public void toddler() {
		if (age < 4 && gender == 'g') {
			System.out.println("Toddler girl!");
		}
		
		else if (age < 4 && gender == 'b') {
			System.out.println("Toddler boy!");
		}
		
		else {
			System.out.println("Not a toddler");
			
		}
	}
	
	public void movieDiscounts() {
		if (age > 65 || age < 12) {
			System.out.println("They get the discount!");
		}
		
		else {
			System.out.println("They do not get the discount");
		}
	}
	
	public void teenager() {
		if (age > 12 && age < 18) {
			System.out.println("They're a teenager");
		}
		
		else {
			System.out.println("They're not a teenager");
		}
			
	}
	
	public void teammates(Human runner, Human runner2) {
		if (runner.getGender()== runner2.getGender() && (runner2.getAge() - runner.getAge() <= 2 && runner2.getAge() - runner.getAge() >= 0)) {
			{
				System.out.println("They are teammates!");
			}
		}
		
		else {
			System.out.println("They cannot be teammates!");
		}
	}

	public static void main(String[] args) {
		Human runner = new Human();
		Human runner2 = new Human();
		
		runner.setAge(15);
		runner.setGender('g');
		runner2.setAge(17);
		runner2.setGender('g');
		runner.vote();
		runner.tetanus();
		runner.toddler();
		runner.movieDiscounts();
		runner.teenager();
		runner.teammates(runner, runner2);
		
		}

}