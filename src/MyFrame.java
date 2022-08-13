import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyPanel panel;
	MyFrame() {
		panel = new MyPanel();
		Image image = new ImageIcon("Images\\spaceInvader.png").getImage();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Animasyon");
		this.setIconImage(image);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
