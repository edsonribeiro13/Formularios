package visao;

import java.awt.Color;

import javax.swing.JPanel;

public class TelaCadastroClasse extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroClasse painel = new TelaCadastroClasse();
	
	public TelaCadastroClasse () {
		super();
	}
	
	public static TelaCadastroClasse criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setBackground(Color.BLACK);
		return painel;
	}

}
