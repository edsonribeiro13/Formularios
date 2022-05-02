package controle;

import javax.swing.JPanel;

import visao.*;

public class ControladorFrame{
	
	public static void getTelaCadastoProfessor() {
		Frame.getFrame().setContentPane(visao.PanelCadastrarprofessor.getCadastrarprofessor());
	}
	public static void getTelaCadastroAluno() {
		Frame.getFrame().setContentPane(visao.TelaCadastroAluno.getTelaCadastroAluno());
	}
	public static void getTelaCadastroClasse() {
		Frame.getFrame().setContentPane(visao.TelaCadastroClasse.getTelaCadastroClasse());
	}
	public static void getTelaCadastroDisciplina() {
		Frame.getFrame().setContentPane(visao.TelaCadastroDisciplina.getTelaCadastroDisciplina());
	}
	public static void getTelaCadastroPerLet() {
		Frame.getFrame().setContentPane(visao.TelaCadastroPerLet.getTelaCadastroPerLet());
	}

	public static JPanel getPanel(){
		return (JPanel) Frame.getFrame().getContentPane();
	}
	
	public static void main(String[] args) {
		new ControleBarradeMenu();
		new ControleBotao();
		Frame.getFrame();
	}
	
}
