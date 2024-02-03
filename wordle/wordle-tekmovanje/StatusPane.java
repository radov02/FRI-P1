/**
 * Razred 'statusna vrstica' za izpis sporocil
 */

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Color;

public class StatusPane {
	
	private String message;
	private String fontNameCrke;
	private boolean darkMode;
	private JPanel panel;
	
	private Color barvaOzadja;
	private Color barvaTeksta;
	private boolean isVisible;
	
	public  StatusPane(String message, String fontNameCrke, boolean darkMode, JPanel panel) {
		this.message = message;
		this.fontNameCrke = fontNameCrke;
		this.darkMode = darkMode;
		this.panel = panel;
		this.barvaOzadja = Color.BLACK;
		this.barvaTeksta = Color.WHITE;
		this.isVisible = false;
	}

	public void paintComponent(Graphics g, Point xy, double tileWidth, double tileHeight) {
		Graphics2D g2 = (Graphics2D)g;
		if (!isVisible)
			return;
		
		double x = xy.getX();
		double y = xy.getY();
		
		Stroke original = g2.getStroke();
		BasicStroke single = new BasicStroke(1.0f);
		g2.setStroke(single);
		
		int arcWidth = 20;
		int arcHeight = 20;
		g.setColor(this.barvaOzadja);
		g2.fillRoundRect(ri(x), ri(y), ri(tileWidth), ri(tileHeight), arcWidth, arcHeight);
		g2.drawRoundRect(ri(x), ri(y), ri(tileWidth), ri(tileHeight), arcWidth, arcHeight);
		
		// 2 - message font - Arial 14 BOLD
		Font originalFont = g2.getFont();
		Font arialBold = new Font(this.fontNameCrke, Font.BOLD, 16);
		FontMetrics fm = g2.getFontMetrics(arialBold);
		int hText = fm.getAscent();
		
		double xMessage = x + tileWidth / 2 - fm.stringWidth(this.message) / 2;
		double yMessage = y + (fm.getAscent() + (tileHeight - (fm.getAscent() + fm.getDescent())) / 2);
		g2.setFont(arialBold);
		g2.setColor(this.barvaTeksta);
		g2.drawString(this.message, ri(xMessage), ri(yMessage));
		g2.setFont(originalFont);
		
		g2.setStroke(original);
	}
	
	public void toggleDarkLightMode() {
		this.darkMode = !this.darkMode;
		if (this.darkMode) {
			// barve za TEMNO ozadje
			this.barvaTeksta = Color.BLACK;
			this.barvaOzadja = Color.WHITE;
		} else {
			// barve za SVETLO ozadje
			this.barvaTeksta = Color.WHITE;
			this.barvaOzadja = Color.BLACK;
		}
		
	}

	public void hide() {
		this.isVisible = false;
	}
	
	public void show() {
		this.isVisible = true;
	}
	
	public void clearText() {
		this.message = "";
	}
	
	public void setText(String message) {
		this.message = message;
	}

	private static int ri(double value) {
		return (int) Math.round(value);
	}
}
