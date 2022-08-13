import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener{
	final int panel_width = 1600;
	final int panel_height = 1000;
	Image enemy;
	Image enemy2;
	Image enemy3;
	Image backgroundImage;
	javax.swing.Timer timer;
	Random random = new Random();
	int xVelocity = random.nextInt(10) + 0;
	int yVelocity = random.nextInt(10) + 0;
	int x2Velocity = random.nextInt(10) + 0;
	int y2Velocity = random.nextInt(10) + 0;
	int x3Velocity = random.nextInt(10) + 0;
	int y3Velocity = random.nextInt(10) + 0;
	int x = 0;
	int y = 0;
	int x2 = 500;
	int y2= 500;
	int x3 = 0;
	int y3= 500;
	
	MyPanel() {
		 this.setPreferredSize(new Dimension(panel_width, panel_height));
		 this.setBackground(Color.black);
		 enemy = new ImageIcon("Images\\spaceInvader.png").getImage();
		 enemy2 = new ImageIcon("Images\\flying-saucer_1f6f8.png").getImage();
		 enemy3 = new ImageIcon("Images\\yoda.png").getImage();
		 backgroundImage = new ImageIcon("Images\\space3.png").getImage();
		 timer = new javax.swing.Timer(10, this);
		 timer.start();
	 }
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		Graphics2D g2D2 = (Graphics2D) g;
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
		g2D2.drawImage(enemy2, x2, y2, null);
		g2D2.drawImage(enemy3, x3, y3, null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ( x >= panel_width - enemy.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}		
		x = x + xVelocity;
		
		if ( y >= panel_height - enemy.getHeight(null) || y < 0) {
			yVelocity = yVelocity * -1;
		}		
		y = y + yVelocity;
		if ( x2 >= panel_width - enemy2.getWidth(null) || x2 < 0) {
			x2Velocity = x2Velocity * -1;
		}		
		x2 = x2 + x2Velocity;
		
		if ( y2 >= panel_height - enemy2.getHeight(null) || y2 < 0) {
			y2Velocity = y2Velocity * -1;
		}		
		y2 = y2 + y2Velocity;
		if ( x3 >= panel_width - enemy3.getWidth(null) || x3 < 0) {
			x3Velocity = x3Velocity * -1;
		}		
		x3 = x3 + x3Velocity;
		
		if ( y3 >= panel_height - enemy3.getHeight(null) || y3 < 0) {
			y3Velocity = y3Velocity * -1;
		}		
		y3 = y3 + y3Velocity;
		repaint();
		
	}
}
