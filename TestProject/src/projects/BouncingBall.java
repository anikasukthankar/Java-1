package projects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BouncingBall extends JPanel {
	
	private final int WIDTH = 600, HEIGHT = 600, WINDOW_HEIGHT = 650;
	private final int DIAM = 50;

	
	private int ballX = WIDTH/2;
	private int ballY = HEIGHT/2;
	private int speedX = 5;
	private int speedY = 3; 
	
	
	// move the ball according to its current velocity
	public void move_ball() {
		
		ballX += speedX;
		ballY += speedY;

	}
	
	// make the ball bounce if need be
	public void check_collisions() {
		
		if (ballX < 0 || ballX + DIAM > WIDTH) {
			speedX *= -1;
		}
		
				
		if (ballY < 0 || ballY + DIAM > HEIGHT) {
			speedY *= -1;
		}
		
	}
	
	// defines what we want to happen any time we draw the game
	public void paint(Graphics g) {
		// background color is white
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// draw the ball - where do we want to draw it??
		g.setColor(Color.blue);
		g.setColor(new Color(50,100,200));
		
		g.fillOval(ballX, ballY, DIAM, DIAM);


	}
	
	/////////////////////////////////////////
	/////////////////////////////////////////
	
	// THE REST IS SETUP WHICH YOU ARE NOT RESPONSIBLE FOR
	
	// runs the game - note that this is actually a very simple method
	// because we do all the work in helper methods.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here 
		// it is okay because closing the graphics window will end the program
		while (true) {
	
			// updates the scene
			move_ball();
			check_collisions();
			
			// redraws the game
			repaint();
			
			//rests for a portion of a second
			try { Thread.sleep(10); } 
			catch (Exception ex) {}
		}
	}

	// very simple main method to get the game going
	public static void main(String[] args) {
		new BouncingBall(); 
	}
 
	// a constructor which sets up the layout and settings of our graphics.
	// do not play around with this method unless you know what you are doing!
	public BouncingBall() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		run();
	}
}