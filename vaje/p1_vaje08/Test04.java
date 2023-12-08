import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.List;
import java.util.ArrayList;


public class Test04 {
	
	private static final int STEVILO_CLANOV = 20;
	private static final int STEVILO_IZDANIH_NASLOVOV = 15;
	private static final int STEVILO_IZVODOV = 4;
	
	private static final String DNEVNIK_DOGODKOV = "log-izposoj.txt";
	private static final char SEPARATOR = '|';
	
	private static Transakcija[] preberiLogIzposoj(String fileName) {
		List<Transakcija> tlist = new ArrayList<>();
		
		File file = new File(fileName);
		if (!file.exists()) {
			System.out.printf("[Napaka]: datoteka %s ne obstaja%n", fileName);
			return null;
		}
		try {
			Scanner fileReader = new Scanner(file);
			int ix = 0;
			while (fileReader.hasNextLine()) {
				String vrstica = fileReader.nextLine();
				String[] tokens = vrstica.split("\\" + SEPARATOR);
				if (tokens.length != 5) {
					System.out.printf("[Napaka]: parsing...%n");
					return null;
				}
				// 05.09.2023|3|15|I|0
				String dateString = tokens[0];
				int clan = -1;
				int naslov = -1;
				String vrsta = tokens[3];
				String status = tokens[4];
				VrstaTransakcije vt = vrsta.equals("I") ? VrstaTransakcije.IZPOSOJA : VrstaTransakcije.VRACILO;
				Status st = status.equals("0") ? Status.OK : Status.NEUSPESNO;
				
				DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
				GregorianCalendar calendar = null;
				try {
					Date datum = dateFormat.parse(dateString);
					calendar = new GregorianCalendar();
					calendar.setTime(datum);
					// System.out.printf("%d.%d.%d%n", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
					clan = Integer.parseInt(tokens[1]);
					naslov = Integer.parseInt(tokens[2]);
				} catch (ParseException e) {
					System.out.printf("[Napaka]: %s%n", e.getMessage());
					return null;
				} catch (NumberFormatException ex) {
					System.out.printf("[Napaka]: %s%n", ex.getMessage());
					return null;
				}
				Transakcija transakcija = Transakcija.ustvariTransakcijo(clan, naslov, vt, calendar, st);
				tlist.add(transakcija);	
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.printf("[Napaka]: %s%n", e.getMessage());
			e.printStackTrace();
		}
		return tlist.toArray(new Transakcija[0]);
	}
	
	
	
	public static void main(String[] args) {
		Transakcija[] transakcije = preberiLogIzposoj(DNEVNIK_DOGODKOV);
		Knjiznica knjiznica = new Knjiznica(STEVILO_CLANOV, STEVILO_IZDANIH_NASLOVOV, STEVILO_IZVODOV, transakcije);
		
		// testiranje metod
		
		ParTransakcij[] pari = knjiznica.vrniZakljuceneIzposoje();
		System.out.printf("%nVseh zakljucenih izposoj: %d%n", pari.length);
		
		Transakcija[] odprte = knjiznica.vrniOdprteIzposoje();
		System.out.printf("%nVseh odprtih izposoj: %d%n", odprte.length);
		
		System.out.printf("%nPodatki o najdaljsi izposoji: %s%n", knjiznica.najdaljsaIzposoja());
		
		int[] moljData = knjiznica.knjizniMolj();
		System.out.printf("%nKnjizni molj je clan: %d (%d knjig).%n", moljData[0], moljData[1]);
	}
}