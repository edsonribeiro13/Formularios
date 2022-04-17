package visao;

import java.awt.Color;

import javax.swing.JPanel;

public class TelaCadastroDisciplina extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroDisciplina painel;
	
	public TelaCadastroDisciplina () {
		super();
	}
	
	public static TelaCadastroDisciplina criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setLayout(null);
		painel.setBackground(Color.BLACK);

		painel.add(Labels.getTitulo("Cadastro de Disciplina"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Labels.getNomeLabel("Ementa"));
		painel.add(Labels.getNomeLabel("Carga horária"));

		Labels.setLabelNull();

		return painel;
	}

    public static JPanel getTelaCadastroDisciplina() {
        if(painel == null){
			painel = new TelaCadastroDisciplina();
			painel = TelaCadastroDisciplina.criarPainel();
		}

		return painel;
    }

}
