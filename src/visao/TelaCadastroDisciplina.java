package visao;

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
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());

		painel.add(Labels.getTitulo("Cadastro de Disciplina"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Ementa"));
		painel.add(Utilidades.getCampo2(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Carga horária"));
		painel.add(Utilidades.getCampo3(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButton(Labels.getLabelX() + 250, Labels.getLabelY() + 50));

		Labels.setLabelNull();

		return painel;
	}

    public static JPanel getTelaCadastroDisciplina() {
        if(painel == null){
			painel = new TelaCadastroDisciplina();
		}

		painel = TelaCadastroDisciplina.criarPainel();

		return painel;
    }

}
