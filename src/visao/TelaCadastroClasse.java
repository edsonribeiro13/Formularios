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
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Color.BLACK);

		painel.add(Labels.getTitulo("Cadastro de classe"));
		painel.add(Labels.getNomeLabel("Aluno"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButtonPesquisar(Labels.getLabelX() + 520, Labels.getLabelY() - 10));
		painel.add(Labels.getNomeLabel("Professor"));
		painel.add(Utilidades.getCampo2(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Periodo Letivo"));
		painel.add(Utilidades.getCampo3(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Disciplina"));
		painel.add(Utilidades.getCampo4(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButton(Labels.getLabelX() + 250, Labels.getLabelY() + 50));

		Labels.setLabelNull();

		return painel;
	}

    public static JPanel getTelaCadastroClasse() {
        if(painel == null){
			painel = new TelaCadastroClasse();
		}

		painel = TelaCadastroClasse.criarPainel();

		return painel;
    }

}
