package controle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Aluno;
import modelo.Classe;
import modelo.Disciplina;
import modelo.PeriodoLetivo;
import modelo.Professor;
import repositorio.Repositorio;
import visao.PanelCadastrarprofessor;
import visao.TelaCadastroAluno;
import visao.TelaCadastroClasse;
import visao.TelaCadastroDisciplina;
import visao.TelaCadastroPerLet;
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
                Repositorio.SetProfessor(professor);
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
                Repositorio.setAluno(aluno);
            }
            //
            if(ControladorFrame.getPanel() == TelaCadastroClasse.criarPainel()){
                Classe classe = new Classe();
                ArrayList<Aluno> alunos = new ArrayList<Aluno>();
                int i = 0;
                if(e.getComponent() == Utilidades.getButtonPesquisar(0, 0)){
                    alunos.add(Repositorio.getAluno(Utilidades.getCampo1(0, 0).getText()));
                    Aluno alunoAux = alunos.get(i);
                    if(alunoAux == null){
                        alunos.remove(i);
                        i -= 1;
                    }
                    i++;
                }
                classe.setAlunos(alunos);
                classe.setProfessor(Repositorio.getProfessor(Utilidades.getCampo2(0, 0).getText()));
                classe.setPeriodoLetivo(Repositorio.getPeriodoLetivo(Utilidades.getCampo4(0, 0).getText()));
                classe.setDisciplina(Repositorio.getDisciplina(Utilidades.getCampo4(0, 0).getText()));
                Repositorio.SetClasse(classe);
            }
            if(ControladorFrame.getPanel() == TelaCadastroDisciplina.criarPainel()){
                Disciplina disciplina = new Disciplina();
                disciplina.setNome(Utilidades.getCampo1(0,0).getText());
                disciplina.setEmenta(Utilidades.getCampo2(0,0).getText());
                disciplina.setCargaHoraria(Integer.parseInt(Utilidades.getCampo3(0,0).getText()));
                Repositorio.setDisciplina(disciplina);
            }
            if(ControladorFrame.getPanel() == TelaCadastroPerLet.criarPainel()){
                PeriodoLetivo per = new PeriodoLetivo();
                per.setNome(Utilidades.getCampo1(0,0).getText());
                per.setDiasLetivos(Integer.parseInt(Utilidades.getCampo2(0,0).getText()));
                per.setDataInicio((Utilidades.getCampo3(0,0).getText()));
                per.setDataFim((Utilidades.getCampo3(0,0).getText()));
                Repositorio.setPeriodoLetivo(per);
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
