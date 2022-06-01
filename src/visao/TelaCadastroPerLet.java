package visao;
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
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());

		painel.add(Labels.getTitulo("Cadastro de Periodo"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Dias letivos"));
		painel.add(Utilidades.getCampo2(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Data de inicio"));
		painel.add(Utilidades.getCampo3(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Labels.getNomeLabel("Data de fim"));
		painel.add(Utilidades.getCampo4(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButton(Labels.getLabelX() + 250, Labels.getLabelY() + 50));

		Labels.setLabelNull();

		return painel;
		
	}

    public static TelaCadastroPerLet getTelaCadastroPerLet(){
		if(painel == null){
			painel = new TelaCadastroPerLet();
		}
		painel = TelaCadastroPerLet.criarPainel();

		return painel;

	}
}
