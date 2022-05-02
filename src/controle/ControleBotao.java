package controle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import modelo.Aluno;
import modelo.Professor;
import visao.PanelCadastrarprofessor;
import visao.TelaCadastroAluno;
import visao.Utilidades;

public class ControleBotao extends JButton implements MouseListener{

    int i = 0;
    
    public ControleBotao(){
        Utilidades.getButton().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent() == Utilidades.getButton()){
            if(ControladorFrame.getPanel() == PanelCadastrarprofessor.criarPainel()){
                Professor professor = new Professor();
                professor.setNome(Utilidades.getCampo1(0,0).getText());
                professor.setCpf(Utilidades.getCampo2(0,0).getText());
                professor.setRg(Utilidades.getCampo3(0,0).getText());
                professor.setDataNascimento(Utilidades.getCampo4(0,0).getText());
                professor.setMatricula(Utilidades.getCampo5(0,0).getText());
                professor.setTitulacao(Utilidades.getCampo6(0,0).getText());
                professor.setRegimeTrabalho(Utilidades.getCampo7(0,0).getText());
                professor.setArea(Utilidades.getCampo8(0,0).getText());
                professor.setEndereco(Utilidades.getCampo9(0,0).getText(), 
                Utilidades.getCampo10(0,0).getText(), 
                Utilidades.getCampo11(0,0).getText(), 
                Utilidades.getCampo12(0,0).getText(), 
                Utilidades.getCampo13(0,0).getText(), 
                Integer.parseInt(Utilidades.getCampo14(0,0).getText()));
                Professor.SetProfessor(professor);
            }
            if(ControladorFrame.getPanel() == TelaCadastroAluno.criarPainel()){
                Aluno aluno = new Aluno();
                aluno.setNome(Utilidades.getCampo1(0,0).getText());
                aluno.setCpf(Utilidades.getCampo2(0,0).getText());
                aluno.setRg(Utilidades.getCampo3(0,0).getText());
                aluno.setDataNascimento(Utilidades.getCampo4(0,0).getText());
                aluno.setMatricula(Utilidades.getCampo5(0,0).getText());
                aluno.setSexo(Utilidades.getCampo6(0,0).getText());
                aluno.setCurso(Utilidades.getCampo7(0,0).getText());
                aluno.setEndereco(Utilidades.getCampo8(0,0).getText(), 
                Utilidades.getCampo9(0,0).getText(), 
                Utilidades.getCampo10(0,0).getText(), 
                Utilidades.getCampo11(0,0).getText(), 
                Utilidades.getCampo12(0,0).getText(), 
                Integer.parseInt(Utilidades.getCampo13(0,0).getText()));
                Aluno.setAluno(aluno);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
