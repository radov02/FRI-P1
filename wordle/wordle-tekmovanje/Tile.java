import java.awt.Point;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Toolkit;

public class Tile {
	
	private static char BLANK = ' ';
	private static Color HIMALAYA_PEAKS = new Color(226, 232, 240);
	private static Color VALENTINO = new Color(51, 43, 51);
	// barve namigov
	private static Color GREEN = new Color(108, 169, 101);
	private static Color YELLOW = new Color(200, 182, 83);
	private static Color GRAY = new Color(120, 124, 127);
	private static Color DIMGRAY = new Color(105, 105, 105);
	
	private static final int OCTAGON = 0;
	private static final int SQUARE = 1;
	
	private char oznaka;
	private int i;
	private int j;
	private String fontNameCrke;
	private int borderWidth;
	private boolean darkModeActive;

	private Color barvaPloscice;
	private Color barvaObroba;
	private Color barvaActivatedObroba;
	private Color oznakaColor;
	private Color barvaError;
	private boolean isHighlighted;
	private boolean showHint;
	private boolean isActive;
	private boolean isHdden;
	private TileShape shape;
	// the factor by which coordinates are scaled along the Y axis direction
	private double sy;
	
	private double dx;
	private double dy;
	private double tileWidth;
	private double tileHeight;
	
	public Tile(char oznaka, int i, int j, String fontNameCrke, TileShape shape, boolean darkMode) {
		this.oznaka = oznaka;
		this.i = i;
		this.j = j;
		this.fontNameCrke = fontNameCrke;
		this.oznakaColor = Color.BLACK;
		
		this.borderWidth = 2;
		this.darkModeActive = darkMode;
		
		this.barvaPloscice = Color.BLACK;
		this.barvaObroba = Tile.HIMALAYA_PEAKS; // 51, 43, 51
		//this.barvaObroba = new Color(51, 43, 51);
		
		this.barvaActivatedObroba = Color.BLACK;
		this.barvaError = Color.RED;
		this.isHighlighted = false;
		this.showHint = false;
		this.isActive = false;
		this.isHdden = false;
		this.shape = shape; // Tile.OCTAGON; // SQUARE
		
		// AffineTransform.scale(double sx, double sy)
		// -- sy: the "factor" by which coordinates are scaled along the Y axis direction (default no scaling)
		this.sy = 1.0;
		
		this.dx = 0;
		this.dy = 0;
	}
	
	
	public void paintComponent(Graphics g, Point xy, double tileWidth, double tileHeight, double padding) {
		Graphics2D g2 = (Graphics2D)g;
		
		if (this.isHdden) {
			// ob skriti ploscici ne izrisi nic
			return;
		}
		
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
		
		Stroke original = g2.getStroke();
		BasicStroke single = new BasicStroke(1.0f);
		g2.setStroke(single);
		
		double x = xy.getX() + this.dx;
		double y = xy.getY() + this.dy;
		Stroke doubleWidth = new BasicStroke(this.borderWidth);
		g2.setStroke(doubleWidth);		
		
		// o---1
		// |   |
		// 2---3

		// <tile edge> and <gap> between tiles
		double d = tileWidth * 0.06;
		
		double x0 = x + padding;
		double y0 = y + padding;
		
		double x1 = x - padding + tileWidth;
		double y1 = y + padding;
		
		double x3 = x - padding + tileWidth;
		double y3 = y - padding + tileHeight;
		
		double x2 = x + padding;
		double y2 = y - padding + tileHeight;
		
		int[] xPoints = { ri(x0+d), ri(x1-d), ri(x1),   ri(x3),   ri(x3-d), ri(x2+d), ri(x2),   ri(x0)   };
        int[] yPoints = { ri(y0),   ri(y1),   ri(y1+d), ri(y3-d), ri(y3),   ri(y2),   ri(y2-d), ri(y0+d) };
		
		// obroba za poudarek ploscka ob vnosu crke
		double xo0 = x - 2 + padding;
		double yo0 = y - 2 + padding;
		
		double xo1 = x + 2 - padding + tileWidth;
		double yo1 = y - 2 + padding;
		
		double xo3 = x + 2 - padding + tileWidth;
		double yo3 = y + 2 - padding + tileHeight;	
		
		double xo2 = x - 2 + padding;
		double yo2 = y + 2 - padding + tileHeight;
		
		int[] xPointsObroba = { ri(xo0+d), ri(xo1-d), ri(xo1),   ri(xo3),   ri(xo3-d), ri(xo2+d), ri(xo2),   ri(xo0)   };
		int[] yPointsObroba = { ri(yo0),   ri(yo1),   ri(yo1+d), ri(yo3-d), ri(yo3),   ri(yo2),   ri(yo2-d), ri(yo0+d) };

		/** 2D affine transform that performs a linear mapping **/
		
		AffineTransform originalTransform = g2.getTransform();
		//AffineTransform t = new AffineTransform();
		AffineTransform t = new AffineTransform(originalTransform);
		// 1) spremenimo koordinatno izhodisce -> prenesemo tocke v koordinatno izhodisce
		//    ker bomo skalirali po osi y, postavimo na y os sredino ploscka (y os ploscek seka po sredini)
		t.translate(0, (y + tileHeight / 2));
		// 2) skaliramo za faktor this.sy po osi y; po osi x ne skaliramo (zato sx = 1.0)
		//    stiskamo ploscico (sy < 1.0), manjsamo poloscico
		// t.scale(1.25 * 1.0, 1.25 * this.sy);
		t.scale(1.0, this.sy);
		// 3) skalirano ploscico nazaj prenesemo na prejsnje mesto na platnu
		t.translate(0, -(y + tileHeight / 2));
		g2.setTransform(t);
		
		/** 2D affine transform **/
		
		if (this.isHighlighted) {
			// pravkar vnesena crka
			g2.setColor(this.barvaActivatedObroba);
			if (this.shape == TileShape.OCTAGON)
				g2.drawPolygon(xPointsObroba, yPointsObroba, xPointsObroba.length);
			else if (this.shape == TileShape.SQUARE)
				g2.drawRect(ri(x), ri(y), ri(tileWidth), ri(tileHeight));
		} else {
			if (this.showHint) {
				g2.setColor(this.barvaPloscice);
				if (this.shape == TileShape.OCTAGON)
					g2.fillPolygon(xPoints, yPoints, xPoints.length);
				else if (this.shape == TileShape.SQUARE)
					g2.fillRect(ri(x + padding), ri(y + padding), ri(tileWidth - 2 * padding), ri(tileHeight - 2 * padding));
				
			}
			g2.setColor(this.barvaObroba);
			if (this.shape == TileShape.OCTAGON)
				g2.drawPolygon(xPoints, yPoints, xPoints.length);
			else if (this.shape == TileShape.SQUARE)
				g2.drawRect(ri(x + padding), ri(y + padding), ri(tileWidth - 2 * padding), ri(tileHeight - 2 * padding));
		}
		
		// 4 - izracunaj velikost fonta za ploscico (3/5 velikosti ploscice)
		double pixelSize = 4 * tileHeight / 7;
		int fontSizeCalculated = (int) (72.0 * pixelSize / Toolkit.getDefaultToolkit().getScreenResolution());
		if (fontSizeCalculated >= 23 && fontSizeCalculated <= 26)
			fontSizeCalculated = 24;
		// oznaka (crka) - Arial 24 bold
		Font originalFont = g2.getFont();
		Font arialBold = new Font(this.fontNameCrke, Font.BOLD, fontSizeCalculated);
		FontMetrics fm = g2.getFontMetrics(arialBold);
		int hText = fm.getAscent();		
		
		String crka = Character.toString(this.oznaka);
		double xCrka = x + tileWidth / 2 - fm.stringWidth(crka) / 2;
		double yCrka = y + (fm.getAscent() + (tileHeight - (fm.getAscent() + fm.getDescent())) / 2);
		g2.setFont(arialBold);
		g2.setColor(this.oznakaColor);
		g2.drawString(crka, ri(xCrka), ri(yCrka));
		g2.setFont(originalFont);	
		
		g2.setStroke(original);
		
		/** 2d affine transform end **/
		g2.setTransform(originalTransform);
		/** **/
	}
	
	/** ponastavi <tile> v zacetno stanje */
	
	public void reset() {
		this.clearOznaka();
		// barve
		this.oznakaColor = this.darkModeActive ? Color.WHITE : Color.BLACK;
		this.barvaPloscice = Color.BLACK;
		this.barvaObroba = this.darkModeActive ? Tile.VALENTINO : Tile.HIMALAYA_PEAKS;
		this.isHighlighted = false;
		this.showHint = false;
		// faktorji
		this.sy = 1.0;
		this.dx = 0;
		this.dy = 0;
	}
	
	public void toggleDarkLightMode() {
		this.darkModeActive = !this.darkModeActive;
		if (this.darkModeActive) {
			// barve za TEMNO ozadje
			if (this.oznaka == Tile.BLANK) {
				this.barvaObroba = Tile.VALENTINO;
			}
			if (!this.showHint)
				this.oznakaColor = Color.WHITE;
			this.barvaActivatedObroba = Color.WHITE;
		} else {
			// barve za SVETLO ozadje
			if (this.oznaka == Tile.BLANK) {
				this.barvaObroba = Tile.HIMALAYA_PEAKS;
			}
			if (!this.showHint)
				this.oznakaColor = Color.BLACK;
			this.barvaActivatedObroba = Color.BLACK;
		}
	}
	
	public void setOznaka(char oznaka) {
		this.oznaka = oznaka;
	}
	
	public char getOznaka() {
		return this.oznaka;
	}
	
	public void clearOznaka() {
		this.isActive = false;
		this.oznaka = Tile.BLANK;
	}
	
	public double getTileWidth() {
		return this.tileWidth;
	}
	
	public double getTileHeight() {
		return this.tileHeight;
	}
	
	// ob vnosu crke aktivira ploscek -> spremeni barvo okvirja;
	// ob izbrisu crke deaktiviraj ploscek -> zbrisi crko in spremeni barvo okvirja
	
	public void activate() {
		this.isActive = true;
		// this.barvaObroba = Tile.GRAY;
		this.barvaObroba = this.darkModeActive ? Tile.DIMGRAY : Tile.GRAY; // 128, 128, 128
	}
	
	public void deactivate() {
		this.isActive = false;
		this.clearOznaka();
		this.barvaObroba = this.darkModeActive ? Tile.VALENTINO : Tile.HIMALAYA_PEAKS;
	}
	
	/** spot markings */
	
	public void setHintCorrect() {
		// GREEN: a green tile means the letter is in the correct spot.
		this.oznakaColor = Color.WHITE;		
		this.barvaPloscice = Tile.GREEN;
		this.barvaObroba = Tile.GREEN;
		this.showHint = true;
	}
	
	public void setHintWrong() {
		// YELLOW: a yellow tile means the letter is in the word but in the wrong spot.
		this.oznakaColor = Color.WHITE;		
		this.barvaPloscice = Tile.YELLOW;
		this.barvaObroba = Tile.YELLOW;
		this.showHint = true;
	}
	
	public void setHintAbsent() {
		// GRAY: a gray tile means the letter isn't in the word at all.
		this.oznakaColor = Color.WHITE;		
		this.barvaPloscice = Tile.GRAY;
		this.barvaObroba = Tile.GRAY;
		this.showHint = true;
	}
	
	public int getStolpecIndeks() {
		return this.j;
	}
	
	public int getVrsticaIndeks() {
		return this.i;
	}
	
	/** metode za premik ploscka */
	
	public void clearOdmik() {
		this.dx = 0;
		this.dy = 0;
	}
	
	public void move(double dx, double dy) {
		this.dx += dx;
		this.dy += dy;
	}
	
	public void moveRelative(double odstotekX, double odstotekY) {
		this.dx = (odstotekX * this.tileWidth) / 100;
	}
	
	// simulacija proznosti ploscka ob vnosu crke -> izrisemo zunanji rob
	
	public void highlight() {
		this.isHighlighted = true;
	}
	
	public void dehighlight() {
		this.isHighlighted = false;
	}
	
	public void setErrorColor() {
		this.oznakaColor = this.barvaError;
	}
	
	public void hide() {
		this.isHdden = true;
	}
	
	public void show() {
		this.isHdden = false;
	}	
	
	/** flip */
	
	/**
	 * spremeni faktor ys, za katerega so koordinate skalirane po y osi
	 */
	
	public void flip(double dsy) {
		this.sy -= dsy;
	}
	
	private static int ri(double value) {
		return (int) Math.round(value);
	}	
}