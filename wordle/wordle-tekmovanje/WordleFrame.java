import java.awt.*;
import javax.swing.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

import java.lang.reflect.Constructor;

/**
 * Razred predstavlja ogrodje - Frame za okno 
 */
 
public class WordleFrame extends JFrame {
	
	public WordleFrame(String ime) {
		this(ime, false);
	}
	
	public WordleFrame(String ime, boolean hard) {
		this(ime, hard, TileShape.OCTAGON, null);
	}
	
	public WordleFrame(String ime, boolean hardMode, TileShape tileShape, String imeStroja) {
		super(ime);
		this.hardMode = hardMode;
		this.tileShape = tileShape;		
		this.imeStroja = imeStroja;
		this.init();
	}
	
	
	private void init() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scrSize = kit.getScreenSize();
		int width = scrSize.width;
		int height = scrSize.height;
		setLocation(width / 4, height / 8);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		// ikona programa
		try {
			Image slika = kit.getImage(getClass().getClassLoader().getResource(ICON_PATH));
			setIconImage(slika);
		} catch (Exception e) {
			System.err.println("[Warning]: program icon missing...");
		}
		// read .json file
		List<String> slovarBesed = WordleFrame.readWords(WordleFrame.SLOVAR_SI);
		String language = WordleFrame.detectLanguage(slovarBesed);
		// [window] listener
		addWindowListener(new WordleOknoPoslusalec());
		
		int dolzinaBesede = WordleFrame.DEFAULT_DOLZINA_BESEDE;
		int stPoskusov = WordleFrame.DEFAULT_STEVILO_POSKUSOV;
		// nalozi in inicializiraj razred 'stroj'
		if (this.imeStroja != null) {
			this.stroj = WordleFrame.getStrojObject(this.imeStroja, dolzinaBesede, stPoskusov);
		}
		// System.out.println(stroj);
		WordlePanel wordlePanel = null;
		if (this.imeStroja == null)
			wordlePanel = new WordlePanel(dolzinaBesede, stPoskusov, slovarBesed, language, this.hardMode, this.tileShape);
		else
			wordlePanel = new WordlePanel(dolzinaBesede, stPoskusov, slovarBesed, language, this.hardMode, this.tileShape, this.imeStroja, this.stroj);
		// [mouse] listener
		MousePoslusalec misListener = new MousePoslusalec(wordlePanel);
		wordlePanel.addMouseListener(misListener);
		wordlePanel.addMouseMotionListener(misListener);
		
		Container contentPane = getContentPane();
		contentPane.add(wordlePanel, BorderLayout.CENTER);		
	}
	
	/**
	 * @param imeRazreda - this is the fully qualified name of the desired class
	 */
	
	public static Stroj getStrojObject(String imeRazreda, int dolzinaBesede, int stPoskusov) {
		Stroj stroj = null;
		try {
			Class<?> classStroja = Class.forName(imeRazreda);
			
			try {
				// returns a Constructor object that reflects the specified constructor of the class;
				// constructor arguments types need to be passed to the constructor
				
				// Constructor<?> konstruktor = classStroja.getDeclaredConstructor(Integer.TYPE, Integer.TYPE);
				Constructor<?> konstruktor = classStroja.getDeclaredConstructor();
				try {
					// stroj = (Stroj) konstruktor.newInstance(dolzinaBesede, stPoskusov);
					stroj = (Stroj) konstruktor.newInstance();
				} catch(Exception e) {
					System.out.printf("[Napaka | getStrojObject]: %s%n", e.getMessage());
				}
			} catch(NoSuchMethodException e) {
				System.out.printf("[Napaka | getStrojObject]: default constructor not found%n");
			}
			// System.out.println(classStroja);
		} catch(ClassNotFoundException e) {
			System.out.printf("[Napaka | getStrojObject]: manjka razred '%s'.class %n", imeRazreda);
		}
		return stroj;
	}
	
	/**
	 * Metoda ugotovi jezik slovarja.
	 */
	 
	private static String detectLanguage(List<String> slovar) {
		String[] sloBesedeTab = {
			"ahtati", "beseda", "bikica", "cmeruh", "cukrar", "devica", "deviza", "dimjen",
			"dlesen", "enajst", "fajfar", "figura", "gavnar", "gasiti", "gozdar", "hripav",
			"iskriv", "jagnje", "jagoda", "kavica", "klobuk", "kolega", "korito", "spanje",
			"stotin", "tajnik", "tavati", "tegoba", "terasa", "ustava", "vodnik", "zapora"
		};
		String[] engBesedeTab = { 
			"accept", "arrive", "casual", "create", "credit", "author", "battle", "become", 
			"degree", "belong", "corner", "county", "better", "eleven", "emerge", "camera", 
			"doctor", "bishop", "burden", "appeal", "either", "anyone", "anyway", "answer", 
			"effect", "belief", "common", "deputy", "depend", "degree", "church", "crisis"
		};
		List<String> sloBesede = Arrays.asList(sloBesedeTab);
		List<String> engBesede = Arrays.asList(engBesedeTab);
		
		String language = "-";
		if (slovar.containsAll(sloBesede))
			language = "si";
		else if (slovar.containsAll(engBesede))
			language = "en";
		return language;
	}
	
	/**
	 * Metoda prebere besede iz datoteke in vrne seznam.
	 *
	 * @param fileNamePath pot do datoteke s slovarjem besed
	 * @return List<String>; seznam besed
	 */	
	
	private static List<String> readWords(String fileNamePath) {
		List<String> slovar = new ArrayList<>();
		// File file = new File(fileNamePath);
		// BufferedReader bufReader = null;
		// try {
		// 	 FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
		// 	 bufReader = new BufferedReader(fileReader);
		
		// ali obstaja datoteka s seznamom besed
		if (!(new File(fileNamePath)).exists()) {
			System.out.printf("%n[Napaka]: manjka datoteka '%s'%n", fileNamePath);
			return null;
		}
		
		try (InputStream in = WordleFrame.class.getResourceAsStream(fileNamePath)) {
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		
			String vrstica = null;
			int iVrstica = 0;
			int stBesed = 0;
			while ((vrstica = bufReader.readLine()) != null) {
				// odstrani '[' in ']'
				if (vrstica.contains("["))
					vrstica = vrstica.replace("[", "");
				if (vrstica.contains("]"))
					vrstica = vrstica.replace("]", "");
				// odstrani leading trailing spaces
				vrstica = vrstica.trim().toLowerCase();
				// za neprazne vrstice:
				if (vrstica != null && vrstica.length() > 0) {				
					// "kačon", "pilot" --> kacon pilot
					String[] tokens = vrstica.split(",");
					// odstrani prvo " in zadnjo "
					for (int i = 0; i < tokens.length; i++) {
						tokens[i] = tokens[i].replaceAll("^\"|\"$", "");
						tokens[i] = tokens[i].trim();
					}
					for (String token : tokens) {
						slovar.add(token);
						stBesed++;
					}
				}
				iVrstica++;
			}
			bufReader.close();
			if (stBesed == 0)
				System.out.println("[Warning]: seznam besed je prazen...");
			// System.out.printf("#vrstic: %d, #besed: %d%n", iVrstica, stBesed);
		} catch (FileNotFoundException e) {
			System.out.printf("[Napaka]: manjka datoteka '%s'%n", fileNamePath);
			return null;
		} catch (IOException e) {
			System.out.printf("[Napaka]: napaka pri odpiranju datoteke '%s'", fileNamePath);
			return null;
		} catch (Exception e) {
			System.out.println("[Napaka]: nepricakovana napaka...");
			return null;
		}
		return slovar;
	}
	
	/**
	 * Metoda prebere besede iz datoteke in vrne seznam.
	 *
	 * @param ixLang indeks slovarja (slovenski, angleski)
	 * @return List<String>; seznam besed
	 */		
	
	public static List<String> readWords(int ixLang) {
		if (ixLang != 0 && ixLang != 1)
			return null;
		String fileName = (ixLang == 0) ? SLOVAR_SI : SLOVAR_EN;
		List<String> slovarBesed = WordleFrame.readWords(fileName);
		return slovarBesed;
	}
	
	private boolean hardMode;
	private String imeStroja;
	private Stroj stroj;
	private TileShape tileShape;
	
	private static final int DEFAULT_DOLZINA_BESEDE = 6;
	private static final int DEFAULT_STEVILO_POSKUSOV = 6;
	private static final int DEFAULT_WIDTH = 860;
	private static final int DEFAULT_HEIGHT = 450;
	private static final String SLOVAR_SI = "data/slovar.txt";
	
	private static final String SLOVAR_EN = "data/slovar-en.txt";	
	//private static final String ICON_PATH = "images/besednik.png";
	private static final String ICON_PATH = "images/besednik-blind.png";
}