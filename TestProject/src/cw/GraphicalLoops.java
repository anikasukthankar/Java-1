package cw;

//filler code for pong provided by Mr. David
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

public class GraphicalLoops extends JPanel {
//constants that are predefined and won't change as the program runs

	private final int WIDTH = 1000, HEIGHT = 590;
	private final int DIAM = 50, num = 9;
		//defines what we want to happen anytime we draw the graphics



	public void paint(Graphics g) {
		//background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		//call your methods here
		
		//nCircles(10,g);
		//tenbyTen(g);
		//growingCircles(g);
		//checkerBoard(g);
		//circlesquareRoundedRect(g);
		rectangleColors(g);
		
	}

	//runtime: linear
	public void nCircles(int num1, Graphics g) {
		g.setColor(Color.red);
		for (int i = 0; i <= (num1-1)*DIAM; i+=DIAM){
			g.fillOval(i, 0 , DIAM, DIAM);
		}
	}

	
	//runtime: constant
	public void tenbyTen(Graphics g) {
		for (int i = 0; i<= 9*DIAM; i+=DIAM) {
			for (int j = 0; j <= 9*DIAM; j+= DIAM) {
				g.setColor(Color.blue);
				g.fillOval(i, j , DIAM, DIAM);
			}
		}
	}
	
	//runtime: constant
	public void growingCircles(Graphics g) {
		g.setColor(Color.blue);
		
		for (int i = 0, r=3; i< 30; i++) {
			g.fillOval(i*35, 100, r, r);
			
			if (i> 15)
				r-=2;
			
			else
				r+=2;
		}
		
	}
	
	public void checkerBoard(Graphics g) {
		
		for (int i = 0; i<= 7*DIAM; i+=DIAM) {
			for (int j = 0; j <= 7*DIAM; j+= DIAM) {
				if ((i/DIAM) % 2 == 0) {
					if ((j/DIAM) % 2 == 0) {
						g.setColor(Color.white);
						g.fillRect(i, j , DIAM, DIAM);
					}
						
					else {
						g.setColor(Color.black);
						g.fillRect(i, j , DIAM, DIAM);
					}
				}
				
				else {
					if ((j/DIAM) % 2 == 0) {
						g.setColor(Color.black);
						g.fillRect(i, j , DIAM, DIAM);
					}
						
					else {
						g.setColor(Color.white);
						g.fillRect(i, j , DIAM, DIAM);
				
					}
				}
			}
		}
	}
	
	public void circlesquareRoundedRect(Graphics g) {
		for (int i = 0; i<= num*DIAM; i+=DIAM) {
			if ((i/DIAM) % 3 == 1) {
				g.setColor(Color.GREEN);
				g.fillRoundRect(i, 0, DIAM, DIAM, 20, 22);
			}
			
			if ((i/DIAM) % 3 == 0) {
				g.setColor(Color.blue);
				g.fillOval(i, 0, DIAM, DIAM);
			}
			
			if ((i/DIAM) % 3 == 2) {
				g.setColor(Color.red);
				g.fillRect(i, 0, DIAM, DIAM);
			}
		}
	}

	public void rectangleColors(Graphics g) {
		
		for (int i = 0; i<= num*DIAM; i+=DIAM) {
				
			if ((i/DIAM) % 5 == 0) {
				g.setColor(Color.red);
						
				}
					
			if ((i/DIAM) % 5 == 1) {
				g.setColor(Color.cyan);
						
				}
					
			if ((i/DIAM) % 5 == 2) {
				g.setColor(Color.pink);
						
				}
					
			if ((i/DIAM) % 5 == 3) {
				g.setColor(Color.green);
						
				}
					
					if ((i/DIAM) % 5 == 4) {
						g.setColor(Color.black);
						
						}
					
					g.fillRect(i, 0, DIAM, DIAM);
				}	
				
		}
		
		
	//////////////////////////////////////
	//////////////////////////////////////
	//DON'T TOUCH THE BELOW CODE
	//this method runs the actual program.

	public void run() {
		//while(true) should rarely be used to avoid infinite loops, but here it is okay because
		//closing the graphics window will end the program
		while (true) {
			//draws
			//repaint();
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}

	//very simple main method to get the game going
	public static void main(String[] args) {
		new GraphicalLoops();
	}

	//does complicated stuff to initialize the graphics and key listeners
	//DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	//GRAPHICS!
	public GraphicalLoops() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		run();
	}
}
