package visao;

import java.awt.Color;
import javax.swing.JPanel;

public class TelaCadastroPerLet extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroPerLet painel;
	
	public TelaCadastroPerLet() {
		super();
		
	}
	
	public static TelaCadastroPerLet criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setLayout(null);
		painel.setBackground(Color.BLACK);

		painel.add(Labels.getTitulo("Cadastro de Periodo"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Labels.getNomeLabel("Dias letivos"));
		painel.add(Labels.getNomeLabel("Data de inicio"));
		painel.add(Labels.getNomeLabel("Data de fim"));

		Labels.setLabelNull();

		return painel;
		
	}

    public static TelaCadastroPerLet getTelaCadastroPerLet(){
		if(painel == null){
			painel = new TelaCadastroPerLet();
			painel = TelaCadastroPerLet.criarPainel();
		}

		return painel;

	}
}
