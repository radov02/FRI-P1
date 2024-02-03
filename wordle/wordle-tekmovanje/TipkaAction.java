import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *  AbstractAction listener class - za KeyBindings
 */
 
public class TipkaAction extends AbstractAction {

	public TipkaAction(String key, WordlePanel panel) {
		this.key = key;
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.panel.isFlipAnimationInProgress())
			return;
		
		Object source = e.getSource();	
		String cmd = e.getActionCommand();
		int modifiers = e.getModifiers();

		// 1 - funkcijske tipke (F1, F2, ... F12)
		if (cmd == null) {
			if (this.key.equals(TipkaAction.F5))
				this.panel.functionKeyF5Pressed();
			return;
		}
		// 2 - pritisk na tipko abecede?
		if (CRKE_ABECEDE.indexOf(cmd) != -1) {
			this.panel.crkaPressed(cmd);
		} else if (cmd.equals(" ")) {
			this.panel.spacePressed();
		}
		// 3 - ostale kontrolne tipke (ENTER, BACKSPACE, ...)
		if (this.key.equals(TipkaAction.BACK_SPACE)) {
			this.panel.backspacePressed();
		}
		else if (this.key.equals(TipkaAction.ENTER)) {
			this.panel.enterPressed();
		}
		else if (this.key.equals(TipkaAction.ESCAPE)) {
			this.panel.escapePressed();
		}	
	}
	
	private String key;
	private WordlePanel panel;
	
	public static final String CRKE_ABECEDE = "abcčdefghijklmnopqrsštuvzžxyw";
	public static final String KEY_A = "tipka-a";
	public static final String KEY_B = "tipka-b";
	public static final String SPACE = "space";
	public static final String BACK_SPACE = "backspace";
	public static final String ENTER = "enter";
	public static final String ESCAPE = "escape";
	public static final String F5 = "F5";

	// numeric plus
	public static final String KEY_ADD = "ADD";

}