package cw;

public class Clock {
	private int minutes;
	
	public void setTime(int min) {
		minutes = min;
	}
	
	public void tick() {
		minutes = (minutes + 1)%60;
	}
	
	public void displayTime() {
		System.out.println(minutes % 60);
	}
	
	public static void main(String[] args) {
		Clock tester = new Clock();
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		}
	}