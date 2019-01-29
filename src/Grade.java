import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		for(int x = getWidth()/10; x < getWidth()/10*9; x += getWidth()/10) {
			
			g2d.draw(new Rectangle2D.Double(x, -1, getWidth()/10, getHeight() + 1));
			
		}
		
		for(int y = getHeight()/10; y < getHeight()/10*9; y += getHeight()/10) {
			
			g2d.draw(new Rectangle2D.Double(-1, y, getWidth() + 1, getHeight()/10));
			
		}
		
	}
}
