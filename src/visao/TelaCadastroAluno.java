package visao;

import java.awt.Color;
import javax.swing.JPanel;

public class TelaCadastroAluno extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroAluno painel;
	
	public TelaCadastroAluno() {
		super();
		
	}
	
	public static TelaCadastroAluno criarPainel() {

		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setBackground(Color.BLACK);
		return painel;
		
	}

	public static TelaCadastroAluno getTelaCadastroAluno(){
		if(painel == null){
			painel = new TelaCadastroAluno();
			painel = TelaCadastroAluno.criarPainel();
		}

		return painel;

	}

}
