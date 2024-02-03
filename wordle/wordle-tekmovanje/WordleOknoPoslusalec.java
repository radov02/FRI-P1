/** 
 *  The listener class for receiving window events (programa Wordle).
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class WordleOknoPoslusalec extends WindowAdapter {
	
	public WordleOknoPoslusalec() {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.printf("[-]");
	}
}