package visao;

import java.awt.Color;

import javax.swing.JPanel;

public class TelaCadastroClasse extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaCadastroClasse painel;
	
	public TelaCadastroClasse () {
		super();
	}
	
	public static TelaCadastroClasse criarPainel() {
		painel.setVisible(true);
		painel.setSize(790, 780);
		painel.setLayout(null);
		painel.setBackground(Color.BLACK);

		painel.add(Labels.getTitulo("Cadastro de classe"));
		painel.add(Labels.getNomeLabel("Aluno"));
		painel.add(Labels.getNomeLabel("Professor"));
		painel.add(Labels.getNomeLabel("Periodo Letivo"));
		painel.add(Labels.getNomeLabel("Disciplina"));

		Labels.setLabelNull();

		return painel;
	}

    public static JPanel getTelaCadastroClasse() {
        if(painel == null){
			painel = new TelaCadastroClasse();
			painel = TelaCadastroClasse.criarPainel();
		}

		return painel;
    }

}
