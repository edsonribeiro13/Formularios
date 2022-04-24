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
		painel.setBackground(visao.css.getColor());
		
		painel.add(Labels.getTitulo("Cadastro de alunos"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("CPF"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("RG"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Data de Nascimento"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Matricula"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("logradouro"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("cidade"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("bairro"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("estado"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("complemento"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("numero"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));

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
