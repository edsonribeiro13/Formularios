package visao;

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
		painel.setLayout(null);
		painel.setBackground(css.getColor());
		
		painel.add(Labels.getTitulo("Cadastro de professores"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Labels.getNomeLabel("CPF"));
		painel.add(Labels.getNomeLabel("RG"));
		painel.add(Labels.getNomeLabel("Data de Nascimento"));
		painel.add(Labels.getNomeLabel("Matricula"));
		painel.add(Labels.getNomeLabel("Titulacao"));
		painel.add(Labels.getNomeLabel("Regime de Trabalho"));
		painel.add(Labels.getNomeLabel("Área"));
		painel.add(Labels.getNomeLabel("logradouro"));
		painel.add(Labels.getNomeLabel("cidade"));
		painel.add(Labels.getNomeLabel("bairro"));
		painel.add(Labels.getNomeLabel("estado"));
		painel.add(Labels.getNomeLabel("complemento"));
		painel.add(Labels.getNomeLabel("numero"));

		Labels.setLabelNull();

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
