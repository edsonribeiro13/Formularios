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
	private static JMenuItem cadastroPerLet = new JMenuItem("Novo Periodo Letivo");
	private static JMenu barradeMenu = new JMenu("Salvar");

	private static JMenu barradeMenuCon = new JMenu("Consultar");
	private static JMenuItem consultaProfessor = new JMenuItem("Consultar Professor");
	private static JMenuItem consultaAluno = new JMenuItem("Consultar Aluno");

	
	public static JMenu novoSalvar() {
		
		barradeMenu.add(getCadastroProfessor());
		barradeMenu.add(getCadastroAluno());
		barradeMenu.add(getCadastroClasse());
		barradeMenu.add(getCadastroDisciplina());
		barradeMenu.add(getCadastroPerLet());
		
		return barradeMenu;
	}

	public static JMenu novoConsultar() {
		
		barradeMenuCon.add(getConsultaProfessor());
		barradeMenuCon.add(getConsultaAluno());
		
		return barradeMenuCon;
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

	public static JMenuItem getConsultaProfessor() {
		return consultaProfessor;
	}

	public static void setConsultaProfessor(JMenuItem consultaProfessor) {
		MenuItems.consultaProfessor = consultaProfessor;
	}

	public static JMenuItem getConsultaAluno() {
		return consultaAluno;
	}

	public static void setConsultaAluno(JMenuItem consultaAluno) {
		MenuItems.consultaAluno = consultaAluno;
	}
	
}
