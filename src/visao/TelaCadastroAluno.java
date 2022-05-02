package visao;

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
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(visao.Utilidades.getColor());
		
		painel.add(Labels.getTitulo("Cadastro de alunos"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("CPF"));
		painel.add(Utilidades.getCampo2(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("RG"));
		painel.add(Utilidades.getCampo3(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Data de Nascimento"));
		painel.add(Utilidades.getCampo4(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Matricula"));
		painel.add(Utilidades.getCampo5(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("logradouro"));
		painel.add(Utilidades.getCampo6(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("cidade"));
		painel.add(Utilidades.getCampo7(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("bairro"));
		painel.add(Utilidades.getCampo8(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("estado"));
		painel.add(Utilidades.getCampo9(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("complemento"));
		painel.add(Utilidades.getCampo10(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("numero"));
		painel.add(Utilidades.getCampo11(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButton(Labels.getLabelX() + 250, Labels.getLabelY() + 50));

		Labels.setLabelNull();

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
