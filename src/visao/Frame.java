package visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PanelCadastrarprofessor telaCadastroProfessor;
	TelaCadastroAluno telaCadastroAluno;
	TelaCadastroClasse telaCadastroClasse;
	TelaCadastroDisciplina telaCadastroDisciplina;
	TelaCadastroPerLet telaCadastroPerLet;
	
	public JMenuItem menuCadastroProfessor = new JMenuItem("Novo Professor");
	private JMenuItem menuCadastroAluno = new JMenuItem("Novo Aluno");
	private JMenuItem menuCadastroClasse = new JMenuItem("Nova Classe");
	private JMenuItem menuCadastroDisciplina = new JMenuItem("Nova Disciplina");
	private JMenuItem menuCadastroPerLet = new JMenuItem("Novo Período Letivo");
	
	private JMenu menuSalvar;
	
	private JMenuBar bar;
	
	public Frame() {
		
		super("Minha tela");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(getBar());
		
		//Get para definir o painel após o clique no menu, colocar dentro de eventos
		this.setContentPane(getTelaaluno());
		this.setContentPane(getPanelCadastrarprofessor());
		this.setContentPane(getTelaCadastroClasse());
		this.setContentPane(getTelaCadastroDisciplina());
		this.setContentPane(getTelaCadastroPerLet());
		
		repaint();
	}
	
	public TelaCadastroAluno getTelaaluno() {
		if(telaCadastroAluno == null)
			telaCadastroAluno = new TelaCadastroAluno();
		
		telaCadastroAluno = TelaCadastroAluno.criarPainel();
		return telaCadastroAluno;
	}

	public PanelCadastrarprofessor getPanelCadastrarprofessor() {
		if(telaCadastroProfessor == null)
			telaCadastroProfessor = new PanelCadastrarprofessor();
		
		telaCadastroProfessor = PanelCadastrarprofessor.criarPainel();
		return telaCadastroProfessor;
	}

	public TelaCadastroClasse getTelaCadastroClasse() {
		if(telaCadastroClasse == null)
			telaCadastroClasse = new TelaCadastroClasse();
		
		telaCadastroClasse = TelaCadastroClasse.criarPainel();
		return telaCadastroClasse;
	}

	public TelaCadastroDisciplina getTelaCadastroDisciplina() {
		if(telaCadastroDisciplina == null)
			telaCadastroDisciplina = new TelaCadastroDisciplina();
		
		telaCadastroDisciplina = TelaCadastroDisciplina.criarPainel();
		return telaCadastroDisciplina;
	}

	public TelaCadastroPerLet getTelaCadastroPerLet() {
		if(telaCadastroPerLet == null)
			telaCadastroPerLet = new TelaCadastroPerLet();
		
		telaCadastroPerLet = TelaCadastroPerLet.criarPainel();
		return telaCadastroPerLet;
	}

	public JMenuBar getBar() {
		if(bar == null)
			bar = new JMenuBar();
		bar.add(getMenuSalvar());
		return bar;
	}

	public JMenu getMenuSalvar() {
		if (menuSalvar == null)
			menuSalvar = new JMenu("Salvar");
		
		menuSalvar.add(getMenuCadastroProfessor());
		menuSalvar.add(getMenuCadastroAluno());
		menuSalvar.add(getMenuCadastroClasse());
		menuSalvar.add(getMenuCadastroDisciplina());
		menuSalvar.add(getMenuCadastroPerLet());
		
		return menuSalvar;
	}

	public JMenuItem getMenuCadastroProfessor() {
		return menuCadastroProfessor;
	}

	public JMenuItem getMenuCadastroAluno() {
		return menuCadastroAluno;
	}

	public JMenuItem getMenuCadastroClasse() {
		return menuCadastroClasse;
	}

	public JMenuItem getMenuCadastroDisciplina() {
		return menuCadastroDisciplina;
	}

	public JMenuItem getMenuCadastroPerLet() {
		return menuCadastroPerLet;
	}
	
	
	

}
