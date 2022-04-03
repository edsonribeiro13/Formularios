package visao;

import java.awt.Color;
import javax.swing.JPanel;

public class TelaCadastroPerLet extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroPerLet painel = new TelaCadastroPerLet();
	
	public TelaCadastroPerLet() {
		super();
		
	}
	
	public static TelaCadastroPerLet criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setBackground(Color.BLACK);
		return painel;
		
	}
}
