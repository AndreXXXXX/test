import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Ball {
	private int x, y; //location
	private int width;
	private Color c;
	
	public Ball() { //the ball on the left, supposed to be the player
		
		x = 0;
		y = 250;
		width = 50;
		c = new Color(50,50,50);
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(this.c);
		g.fillOval(x, y, width, width);
		
	//	x+=5;
		
	}
	


}
