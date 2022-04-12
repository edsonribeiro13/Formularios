package visao;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelCadastrarprofessor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static PanelCadastrarprofessor painel;
	
	public PanelCadastrarprofessor() {
		super();
	}
	
	public static PanelCadastrarprofessor criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setBackground(Color.BLACK);
		return painel;
		
	}

	public static PanelCadastrarprofessor getCadastrarprofessor(){
		if(painel == null){
			painel = new PanelCadastrarprofessor();
			painel = PanelCadastrarprofessor.criarPainel();
		}

		return painel;

	}

}
