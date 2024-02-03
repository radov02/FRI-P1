import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MousePoslusalec implements MouseListener, MouseMotionListener {

	private WordlePanel wordlePanel;

	public MousePoslusalec(WordlePanel panel) {
		this.wordlePanel = panel;
	}

	/**
	 * MouseMotionListener methods
	 */
	
	public void mouseMoved(MouseEvent e) { 
		wordlePanel.mouseMoved(e.getX(), e.getY());
	}
	
	public void mouseDragged(MouseEvent e) { }

	/**
	 * MouseListener methods
	 */
	
	public void mousePressed(MouseEvent e) {
		// invoked when a mouse button has been pressed on a component	
	}
	
	public void mouseReleased(MouseEvent e) {
		// invoked when a mouse button has been released on a component
	}
	
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has been clicked (pressed and released) on a component
		int stKlikov = e.getClickCount();
		int button = e.getButton();
		if (stKlikov == 1) {
			wordlePanel.mouseClicked(e.getX(), e.getY());
		}
		if (stKlikov == 2) {
			if (button == MouseEvent.BUTTON1) {
				wordlePanel.leftMouseDoubleClicked(e.getX(), e.getY());
			} else if (button == MouseEvent.BUTTON3) {
				wordlePanel.rightMouseDoubleClicked(e.getX(), e.getY());
			}
		}
	}
 
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters a component
	}
 
	public void mouseExited(MouseEvent e) {
		// invoked when the mouse exits a component
	}
}