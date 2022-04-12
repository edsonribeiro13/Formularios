package visao;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuItems extends JMenuItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JMenuItem cadastroProfessor = new JMenuItem("Novo Professor");
	private static JMenuItem cadastroAluno = new JMenuItem("Novo Aluno");
	private static JMenuItem cadastroClasse = new JMenuItem("Nova Classe");
	private static JMenuItem cadastroDisciplina = new JMenuItem("Nova Disciplina");
	private static JMenuItem cadastroPerLet = new JMenuItem("Novo Per�odo Letivo");
	private static JMenu barradeMenu = new JMenu("Salvar");
	
	public static JMenu novoSalvar() {
		
		barradeMenu.add(getCadastroProfessor());
		barradeMenu.add(getCadastroAluno());
		barradeMenu.add(getCadastroClasse());
		barradeMenu.add(getCadastroDisciplina());
		barradeMenu.add(getCadastroPerLet());
		
		return barradeMenu;
	}
	
	public static JMenuItem getCadastroProfessor() {
		return cadastroProfessor;
	}
		
	public static JMenuItem getCadastroAluno() {
		return cadastroAluno;
	}
		
	public static JMenuItem getCadastroClasse() {
		return cadastroClasse;
	}
	
	public static JMenuItem getCadastroDisciplina() {
		return cadastroDisciplina;
	}
	
	public static JMenuItem getCadastroPerLet() {
		return cadastroPerLet;
	}
		
}
