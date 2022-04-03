package visao;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BarradeMenu extends JMenu {

	private static BarradeMenu barradeMenu = new BarradeMenu();
	public JMenuItem cadastroProfessor = new JMenuItem("Novo Professor");
	private JMenuItem cadstroAluno = new JMenuItem("Novo Aluno");
	private JMenuItem cadastroClasse = new JMenuItem("Nova Classe");
	private JMenuItem cadastroDisciplina = new JMenuItem("Nova Disciplina");
	private JMenuItem cadastroPerLet = new JMenuItem("Novo Período Letivo");
	
	public BarradeMenu() {
		super();
	}
	
	public static BarradeMenu novo() {
		BarradeMenu.add(cadastroProfessor);
		
		return barradeMenu;
	}


}
