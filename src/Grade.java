import java.awt.Graphics;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		for(int x = getWidth()/10; x < getWidth()/10*9; x += getWidth()/10) {
			
			g.drawRect(x, -1, getWidth()/10, getHeight() + 1);
			
		}
		
		for(int y = getHeight()/10; y < getHeight()/10*9; y += getHeight()/10) {
			
			g.drawRect(-1, y, getWidth() + 1, getHeight()/10);
			
		}
		
	}
}
