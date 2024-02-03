/**
 * Besedna uganka (Besednik) 
 *
 * -- uporabite n(6) priloznosti, da uganete besedo dolzine m(5).
 * -- (C) 2023, FRI, Pozenel & Fuerst.
 *
 */

import javax.swing.*;
import java.util.*;
 
public class TestWordle {
	
	private static final String VERSION = "0.5";
	private static final String NAME = "Besedle";	
	private static final String AUTHOR = "Marko Pozenel";
	
	/**
	 * Parse program arguments
	 */
	
	private static String[] parseArguments(String[] args) {
		String[] mask = new String[] { "normal", null, "0" };
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals("-about") || arg.equals("--about")) {
				int cYear = Calendar.getInstance().get(Calendar.YEAR);
				System.out.printf("%nWordle [%s]%n", TestWordle.NAME);
				System.out.printf("  Version: %s%n", TestWordle.VERSION);
				System.out.printf("  Author: %s%n", TestWordle.AUTHOR);
				System.out.printf("  Copyright (C) 2022-%d. All rights reserved.%n", cYear);
				System.out.printf("  UNI-LJ, FRI.%n");
				System.exit(0);
			} else if (arg.equals("-version") || arg.equals("--version")) {
				System.out.printf("%n%s, version: %s%n", TestWordle.NAME, TestWordle.VERSION);
				System.exit(0);
			} else if (arg.equals("-?") || arg.equals("--?")) {
				System.out.printf("Usage: java -jar %s <options>%n%n", "besedle.jar");
				System.out.printf("where possible options include:%n");
				System.out.printf("  -hard \t Besedle in hard mode; all hints have to be accounted%n");
				System.out.printf("  <engine name>  Automatic mode; game is played by provided engine%n");
				System.out.printf("  -square \t Tile shape; choose square tile shape over octagon%n");				
				System.out.printf("  -version \t Version information%n");
				System.out.printf("  -about \t Print information about application%n");
				System.out.printf("  -? \t\t Print an abstract of options %n");
				System.out.println();
				System.out.printf("left double click \t Start a game played by the provided engine%n");
				System.out.printf("right double click \t Start a new game%n");
				System.out.println();
				System.exit(0);				
			} else if (arg.equals("-hard") || arg.equals("--hard")) {
				mask[0] = "hard";
			} else if (arg.equals("-square") || arg.equals("--square")) {
				mask[2] = "1";
			}
			else if (!arg.contains("-") && !arg.contains("--"))
				mask[1] = arg;
		}
		return mask;
	}
	
	/** main... */

	public static void main(String[] args) {
		String[] parsed = parseArguments(args);
		boolean hardMode = parsed[0].equals("hard") ? true : false;
		String imeStroja = parsed[1];
		TileShape tileShape = parsed[2].equals("1") ? TileShape.SQUARE : TileShape.OCTAGON; 
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String winCaption = TestWordle.NAME;
				if (imeStroja != null)
					winCaption = String.format("%s (%s)", TestWordle.NAME, imeStroja);
				JFrame okno = new WordleFrame(winCaption, hardMode, tileShape, imeStroja);
				okno.setVisible(true);
			}
		});
	}
}