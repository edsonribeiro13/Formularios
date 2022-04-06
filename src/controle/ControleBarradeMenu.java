package controle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import visao.Frame;

public class ControleBarradeMenu extends JMenuItem implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JMenuItem cadastroProfessor = new JMenuItem("Novo Professor");
	private static JMenuItem cadastroAluno = new JMenuItem("Novo Aluno");
	private static JMenuItem cadastroClasse = new JMenuItem("Nova Classe");
	private static JMenuItem cadastroDisciplina = new JMenuItem("Nova Disciplina");
	private static JMenuItem cadastroPerLet = new JMenuItem("Novo Período Letivo");
	private static JMenu barradeMenu = new JMenu("Salvar");
	//private static Handler handler = new Handler();
	
	private static Frame frame = new Frame();
	
	public ControleBarradeMenu() {
		super();
		cadastroAluno.addMouseListener(this);
	}
	
	public static JMenu novoSalvar() {
		frame = ControladorFrame.getFrameAtual();
		
		new ControleBarradeMenu();
		
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

	@Override
	public void mouseClicked(MouseEvent e) {	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getComponent() == cadastroAluno) {
			frame.setContentPane(Frame.getTelaaluno());
			System.out.println(e);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {		
	}

	@Override
	public void mouseEntered(MouseEvent e) {	
	}

	@Override
	public void mouseExited(MouseEvent e) {		
	}
		
	
	
}
