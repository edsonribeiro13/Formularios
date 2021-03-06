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
		painel.setBackground(Utilidades.getColor());
		
		painel.add(Labels.getTitulo("Cadastro de professores"));
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
		painel.add(Labels.getNomeLabel("Titulacao"));
		painel.add(Utilidades.getCampo6(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Regime de Trabalho"));
		painel.add(Utilidades.getCampo7(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Ã�rea"));
		painel.add(Utilidades.getCampo8(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("logradouro"));
		painel.add(Utilidades.getCampo9(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("cidade"));
		painel.add(Utilidades.getCampo10(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("bairro"));
		painel.add(Utilidades.getCampo11(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("estado"));
		painel.add(Utilidades.getCampo12(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("complemento"));
		painel.add(Utilidades.getCampo13(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("numero"));
		painel.add(Utilidades.getCampo14(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButton(Labels.getLabelX() + 250, Labels.getLabelY() + 50));

		Labels.setLabelNull();

		return painel;
		
	}

	public static PanelCadastrarprofessor getCadastrarprofessor(){
		if(painel == null){
			painel = new PanelCadastrarprofessor();
		}

		painel = PanelCadastrarprofessor.criarPainel();

		return painel;

	}
}
