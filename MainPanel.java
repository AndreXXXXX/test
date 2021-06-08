import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener{
	
	Timer animationTimer; 
	Ball b;
	Enemy e;
	Ball2[] obj = new Ball2[10];
	Ball3[] obj2 = new Ball3[10];
	Ball4[] obj3 = new Ball4[10];
	
	public void paint(Graphics g) {
		
		super.paintComponent(g);
		
		//call paint methods of objects
		b.paint(g);
		e.paint(g);
		
		int ax = e.getX();
		int ay = e.getY();
		
		for(Ball2 obje : obj) { 
			obje.update(ax, ay);		
			obje.paint(g);
		} 
		
		for(Ball3 objec : obj2) { 
			objec.update(ax, ay);		
			objec.paint(g);
		} 
		
		for(Ball4 object : obj3) { 
			object.update(ax, ay);		
			object.paint(g);
		} 
		
		
		
	}
	
	
	public MainPanel() {
		
		//Create a JFrame Object
		JFrame f = new JFrame("Example Drawing");
		
		
		f.setSize(800,600); //width and height
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.add(this);
		
		
		animationTimer = new Timer(16, this);
		
		
		animationTimer.start();
		
		
		b = new Ball();
		
		e = new Enemy();
		
		for ( int i = 0; i < 10; i++ ) {
			obj[i] = new Ball2();
		}
		
		for ( int i = 0; i < 10; i++ ) {
			obj2[i] = new Ball3();
		}
		
		for ( int i = 0; i < 10; i++ ) {
			obj3[i] = new Ball4();
		}
		
		f.setVisible(true);
		
		
	}
	//--------------------------------------------------------------> stuff for collision <--------------------------------------------------
		public void update() {
		//calls collide
		for ( int i = 0; i < obj.length; i++ ) {
			b.collide(obj[i]);
		}
		
		for ( int i = 0; i < obj2.length; i++ ) {
			b.collide(obj2[i]);
			}
		
		for ( int i = 0; i < obj3.length; i++ ) {
			b.collide(obj3[i]);
			}
		
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		update();

		repaint();
		
	}
	
	
	
}
