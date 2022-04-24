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
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(css.getColor());
		
		painel.add(Labels.getTitulo("Cadastro de professores"));
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
		painel.add(Labels.getNomeLabel("Titulacao"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Regime de Trabalho"));
		painel.add(css.getCampodeTexto(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Área"));
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

	public static PanelCadastrarprofessor getCadastrarprofessor(){
		if(painel == null){
			painel = new PanelCadastrarprofessor();
			painel = PanelCadastrarprofessor.criarPainel();
		}

		return painel;

	}

}
