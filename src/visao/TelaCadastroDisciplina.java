package visao;

import java.awt.Color;

import javax.swing.JPanel;

public class TelaCadastroDisciplina extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroDisciplina painel = new TelaCadastroDisciplina();
	
	public TelaCadastroDisciplina () {
		super();
	}
	
	public static TelaCadastroDisciplina criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setBackground(Color.BLACK);
		return painel;
	}

}
