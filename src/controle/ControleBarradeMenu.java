package controle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visao.MenuItems;
import javax.swing.JMenuItem;

public class ControleBarradeMenu extends JMenuItem implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControleBarradeMenu() {

		super();
		MenuItems.getCadastroProfessor().addMouseListener(this);
		MenuItems.getCadastroAluno().addMouseListener(this);
		MenuItems.getCadastroClasse().addMouseListener(this);
		MenuItems.getCadastroDisciplina().addMouseListener(this);
		MenuItems.getCadastroPerLet().addMouseListener(this);

		MenuItems.getConsultaAluno().addMouseListener(this);
		MenuItems.getConsultaProfessor().addMouseListener(this);

		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getComponent() == MenuItems.getCadastroProfessor()) {
			ControladorFrame.getTelaCadastoProfessor();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastroAluno()) {
			ControladorFrame.getTelaCadastroAluno();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastroClasse()) {
			ControladorFrame.getTelaCadastroClasse();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastroDisciplina()) {
			ControladorFrame.getTelaCadastroDisciplina();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastroPerLet()) {
			ControladorFrame.getTelaCadastroPerLet();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getConsultaAluno()) {
			ControladorFrame.getTelaConsultaAluno();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getConsultaProfessor()) {
			ControladorFrame.getTelaConsultaProfessor();
			repaint();
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
