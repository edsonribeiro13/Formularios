package visao;

import java.awt.Color;
import java.awt.Container;

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

    public static Container getTelaCadastroClasse() {
        if(painel == null){
			painel = new TelaCadastroClasse();
			painel = TelaCadastroClasse.criarPainel();
		}

		return painel;
    }

}
