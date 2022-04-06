package visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import controle.ControleBarradeMenu;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static PanelCadastrarprofessor telaCadastroProfessor;
	private static TelaCadastroAluno telaCadastroAluno;
	private static TelaCadastroClasse telaCadastroClasse;
	private static TelaCadastroDisciplina telaCadastroDisciplina;
	private static TelaCadastroPerLet telaCadastroPerLet;
	
	private static JMenu menuSalvar;
	
	private static JMenuBar bar;
	
	private static Frame frame = new Frame();
	
	public Frame() {
		
		super();
		
	}
	
	public static Frame novoFrame() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		
		frame.setJMenuBar(getBar());
		
		return frame;
	}
	
	public static TelaCadastroAluno getTelaaluno() {
		if(telaCadastroAluno == null)
			telaCadastroAluno = new TelaCadastroAluno();
		
		telaCadastroAluno = TelaCadastroAluno.criarPainel();
		return telaCadastroAluno;
	}

	public static PanelCadastrarprofessor getPanelCadastrarprofessor() {
		if(telaCadastroProfessor == null)
			telaCadastroProfessor = new PanelCadastrarprofessor();
		
		telaCadastroProfessor = PanelCadastrarprofessor.criarPainel();
		return telaCadastroProfessor;
	}

	public static TelaCadastroClasse getTelaCadastroClasse() {
		if(telaCadastroClasse == null)
			telaCadastroClasse = new TelaCadastroClasse();
		
		telaCadastroClasse = TelaCadastroClasse.criarPainel();
		return telaCadastroClasse;
	}

	public static TelaCadastroDisciplina getTelaCadastroDisciplina() {
		if(telaCadastroDisciplina == null)
			telaCadastroDisciplina = new TelaCadastroDisciplina();
		
		telaCadastroDisciplina = TelaCadastroDisciplina.criarPainel();
		return telaCadastroDisciplina;
	}

	public static TelaCadastroPerLet getTelaCadastroPerLet() {
		if(telaCadastroPerLet == null)
			telaCadastroPerLet = new TelaCadastroPerLet();
		
		telaCadastroPerLet = TelaCadastroPerLet.criarPainel();
		return telaCadastroPerLet;
	}

	public static JMenuBar getBar() {
		if(bar == null)
			bar = new JMenuBar();
		bar.add(getMenuSalvar());
		return bar;
	}

	public static JMenu getMenuSalvar() {
		if (menuSalvar == null) {
			menuSalvar = new JMenu();
		}
		
		menuSalvar = ControleBarradeMenu.novoSalvar();
		
		return menuSalvar;
	}

}
