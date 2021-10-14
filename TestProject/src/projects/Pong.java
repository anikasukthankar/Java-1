//Anika Sukthankar
//October 15, 2021
//Java I (Blue)
//Mr. Friedman

package projects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//if paddles do not move, hit the restart button and press the corresponding keys
//for some reason, if the ball passes thru the paddle (rarely) it will violently shake. Ignore this, since it does not affect the code, and hit the restart button.  
	//I don't know how to fix it :(

public class Pong extends JPanel implements KeyListener {
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 600, HEIGHT = 600, WINDOW_HEIGHT = 650;
	private final int PADDLE_WIDTH = 20, DIAM = 8, PADDLE_HEIGHT = 100;
	private final int PADDLE_SPEED = 4;

	// your instance variables here, I've given you a few 
	private boolean up1, down1, up2, down2; 		// booleans to keep track of paddle movement
	private boolean solo = false;
	
	private int ballXCoord = WIDTH/2;
	private int ballYCoord = HEIGHT/2;
	private int ballXSpeed = 1;
	private int ballYSpeed = 2;
	
	private int paddle1XCoord = 0;
	private int paddle1YCoord = HEIGHT/2;
	private int paddle1YSpeed = 0;
	
	private int paddle2XCoord = WIDTH-PADDLE_WIDTH;
	private int paddle2YCoord = HEIGHT/2;
	private int paddle2YSpeed = 0;
	
	private int player1Score = 0;
	private int player2Score = 0;
	
	private final int COMBINED_SCORE = 5;
	
	// this method moves the ball at each timestep
	public void move_ball() {

		ballXCoord += ballXSpeed;
		ballYCoord += ballYSpeed;
		
	}
	
	// this method moves the paddles at each timestep
	public void move_paddles() {
			
			if (solo) {
				if(ballYCoord>paddle2YCoord){
					paddle2YSpeed=PADDLE_SPEED;
				}
				else
				if(ballYCoord<paddle2YCoord){
					paddle2YSpeed=-1*PADDLE_SPEED;
				}
				else{
					paddle2YSpeed=0;
				}
		}
		
		paddle1YCoord += paddle1YSpeed;
		paddle2YCoord += paddle2YSpeed;
		
	}
	
	// this method checks if there are any bounces to take care of,
	// and if the ball has reached a left/right wall it adds to 
	// the corresponding player's score
	public void check_collisions() {
		
		//if ball hits left wall, player 2 gets point and ball resets in middle of screen
		// when players' combined scores is less than or equal to 5, the ball speeds up 
		if (ballXCoord < 0) {
			player2Score++;
			ballXCoord = WIDTH/2;
			ballYCoord = HEIGHT/2;
			if (player1Score + player2Score <= COMBINED_SCORE) {
				ballXSpeed = 2+ player1Score +player2Score;
				ballYSpeed = 1+ player1Score + player2Score;
			}
		}
		
		//if ball hits right wall, player 1 gets point and ball resets in middle of screen
		// when players' combined scores is less than or equal to 5, the ball speeds up 
		if (ballXCoord + DIAM > WIDTH) {
			player1Score++;
			ballXCoord = WIDTH/2;
			ballYCoord = HEIGHT/2;
			if (player1Score + player2Score <= COMBINED_SCORE) {
				ballXSpeed = 2+ player1Score +player2Score;
				ballYSpeed = 1+ player1Score + player2Score;
			}
			
		}
		
		//if ball hits top or bottom wall, it bounces off
		if (ballYCoord < 0 || ballYCoord + DIAM > HEIGHT) {
			ballYSpeed *= -1;
		}
		
		//if ball hits paddle 1 from side, it bounces off
				if(ballXCoord>paddle1XCoord && ballXCoord<=paddle1XCoord+PADDLE_WIDTH){
					if(ballYCoord+DIAM>paddle1YCoord && ballYCoord<paddle1YCoord+PADDLE_HEIGHT){
						ballXSpeed *=-1;
					}
				}
				//if ball hits paddle 2 from side, it bounces off
				if(ballXCoord+DIAM<paddle2XCoord +PADDLE_WIDTH && ballXCoord+DIAM>=paddle2XCoord){
					if(ballYCoord+DIAM>paddle2YCoord && ballYCoord<paddle2YCoord+PADDLE_HEIGHT){
						ballXSpeed *=-1;
					}
				}
			
	}

	// defines what we want to happen anytime we draw the game
	// you simply need to fill in a few parameters here
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// draw your rectangles and circles here
		
		g.setColor(Color.GREEN);
		g.fillRect(paddle1XCoord, paddle1YCoord, PADDLE_WIDTH, PADDLE_HEIGHT);
		
		g.setColor(Color.GREEN);
		g.fillRect(paddle2XCoord, paddle2YCoord, PADDLE_WIDTH, PADDLE_HEIGHT);
		
		
		//ball colors
		g.setColor(Color.blue);
		g.setColor(new Color(50,100,200));
		
		g.fillOval(ballXCoord, ballYCoord, DIAM, DIAM);
		
		// writes the score of the game - you just need to fill the scores in
		Font f = new Font("Arial", Font.BOLD, 14);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("P1 Score: "+player1Score, WIDTH/5, 20);
		g.drawString("P2 Score: "+player2Score, WIDTH*3/5, 20);
	}

	// defines what we want to happen if a keyboard button has 
	// been pressed - you need to complete this
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// changes paddle direction based on what button is pressed
		if (keyCode == KeyEvent.VK_DOWN) 
			paddle1YSpeed = PADDLE_SPEED;
		
		if (keyCode == KeyEvent.VK_UP) 
			paddle1YSpeed = -1*PADDLE_SPEED;

		// commands 2nd paddle to move if it is not 1 player mode
		if (!solo) {
			if (e.getKeyChar() == 'w')
				paddle2YSpeed = -1*PADDLE_SPEED;
			
			if (e.getKeyChar() =='s')
				paddle2YSpeed = PADDLE_SPEED;
		}
			
		// turn 1-player mode on
		if (e.getKeyChar() == '1') {
			solo = true;
			paddle2YSpeed = PADDLE_SPEED;
		}	
			
		// turn 2-player mode on
		if (e.getKeyChar() == '2') {
			solo = false;
		}
	}

	// defines what we want to happen if a keyboard button
	// has been released - you need to complete this
	public void keyReleased(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// stops paddle motion based on which button is released
		if (keyCode == KeyEvent.VK_UP) 
			paddle1YSpeed = 0;

		if (keyCode == KeyEvent.VK_DOWN) 
			paddle1YSpeed = 0;
		
		if (!solo) {
			if(e.getKeyChar() == 'w')
				paddle2YSpeed = 0;
			
			if (e.getKeyChar() == 's') {
				paddle2YSpeed = 0;
			}
		}

	}
	
	// restarts the game, including scores
	public void restart() {

		ballXCoord = WIDTH/2;
		ballYCoord = HEIGHT/2;
		ballXSpeed = 1;
		ballYSpeed = 2;
		
		paddle1XCoord = 0;
		paddle1YCoord = HEIGHT/2;
		paddle1YSpeed = 0;
		
		paddle2XCoord = WIDTH-PADDLE_WIDTH;
		paddle2YCoord = HEIGHT/2;
		paddle2YSpeed = 0;
		
		player1Score = 0;
		player2Score = 0;
	}

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual game.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws the game
			repaint();
			
			// we move the ball, paddle, and check for collisions
			// every hundredth of a second
			move_ball();
			move_paddles();
			check_collisions();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new Pong();
	}

	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public Pong() {
		JFrame frame = new JFrame();
		JButton button = new JButton("restart");
		frame.setSize(WIDTH+15, WINDOW_HEIGHT+10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restart();
				Pong.this.requestFocus();
			}
		});
		this.addKeyListener(this);
		this.setFocusable(true);
		Pong.this.requestFocus();
		run();
	}
	
	// method does nothing
	public void keyTyped(KeyEvent e) {}
}