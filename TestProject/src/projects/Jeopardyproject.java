//Anika Sukthankar
//November 5, 2021
//Java I (Blue)
//Mr. Friedman

package projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JeopardyProject {
	
	//Constants
	private final int NUMQUESTIONS = 6, NUMCATEGORIES = 6;
	
	//Instance Variables
	private int gridWidth = 800, gridHeight = 600, textHeight = 50; 
	private int score = 0;
	private int gridcenterX = gridWidth/(NUMCATEGORIES*2);
	private int gridcenterY = gridHeight/(NUMQUESTIONS*2);
	private int clickedX = -1;
	private int clickedY = -1;
	
	
	//draws graphics for shapes, lines, and numbers on the grid
	public void draw(Graphics g) {
		
		//fills background color (blue)
		g.setColor(Color.blue);
		g.fillRect(0, 0, gridWidth, gridHeight);
		
		//draws grid panels (black rectangles)
		for (int i = 0; i<= NUMCATEGORIES;i++) {
			
			for (int j = 0; j<= NUMQUESTIONS; j++) {
				g.setColor(Color.black);
				g.drawRect((gridWidth/NUMCATEGORIES) * i, (gridHeight/NUMQUESTIONS) * j , gridWidth/NUMCATEGORIES, gridHeight/NUMQUESTIONS);
				
				//checks to see if box was clicked, and if it has been, then it changes color of number inside box 
				if (clickedX == i && clickedY == j) {
					g.setColor(Color.red);
				}
				
				//if box was not clicked, color of number remains white
				else {
					g.setColor(Color.white);
				}
				
				//shows how many points each panel is worth
				//need j+1, otherwise it will print "0 points" on the first row of panels
				g.drawString((100*(j+1)) + "", (gridWidth/NUMCATEGORIES)*i + gridcenterX, (gridHeight/NUMQUESTIONS)*j+gridcenterY);
					
			}
		}
	}
	
	//controls what happens when user clicks a panel
	public void click(int mouseX, int mouseY) {
		
		//loops through number of rows & columns starting at 0
		for (int i = 0; i<= NUMCATEGORIES;i++) {
			
			for (int j = 0; j<= NUMQUESTIONS; j++) {
				
				//checks if user clicked between starting x-coordinate of a panel and the starting x-coordinate of the next panel in the same row
				if (mouseX > gridWidth/(NUMCATEGORIES)*i && mouseX < gridWidth/(NUMCATEGORIES)*(i+1)) {
					
					//checks if user clicked between starting y-coordinate of a panel and the starting y-coordinate of the next panel in the same column
					if (mouseY > gridHeight/(NUMQUESTIONS)*j && mouseY < gridHeight/(NUMQUESTIONS)*(j+1)) {
						
						//adds designated points to user's score
						score+= 100*(j+1);
						
						//tracks which rectangle was clicked in order to change color in the draw method
						clickedX = i;
						clickedY = j;
						
					}
				}
					
			}
		}
		
	}
		
	// DO NOT TOUCH BELOW CODE //
	
public JeopardyProject() {
		
		JFrame window = new JFrame();
		window.setTitle("Jeopardy!");
		window.setSize(gridWidth, gridHeight + textHeight);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		JTextArea scoreDisplay = new JTextArea();
		scoreDisplay.setEditable(false);
		scoreDisplay.setText("\t\tScore: 0");
		
		JPanel canvas = new JPanel() {
			public void paint(Graphics g) {
				gridWidth = window.getWidth();
				gridHeight = window.getHeight() - textHeight;
				draw(g);
			}
		};
		canvas.setPreferredSize(new Dimension(gridWidth, gridHeight));
		
		canvas.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				click(e.getX(), e.getY());
				scoreDisplay.setText("\t\tScore: " + score);
				window.getContentPane().repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		
		});
		
		container.add(canvas);
		container.add(scoreDisplay);
		window.add(container);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JeopardyProject();
	}

}
