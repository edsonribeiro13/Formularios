package controle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Classe;
import modelo.Disciplina;
import modelo.PeriodoLetivo;
import modelo.Professor;
import repositorio.Repositorio;
import visao.Frame;
import visao.PanelCadastrarprofessor;
import visao.TelaCadastroAluno;
import visao.TelaCadastroClasse;
import visao.TelaCadastroDisciplina;
import visao.TelaCadastroPerLet;
import visao.TelaConsultaAluno;
import visao.TelaConsultaProfessor;
import visao.TelaIni;
import visao.Utilidades;

public class ControleBotao extends JButton implements MouseListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i = 0;
    
    public ControleBotao(){
        Utilidades.getButton().addMouseListener(this);
        Utilidades.getButtonPesquisar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent() == Utilidades.getButton()){
            if(ControladorFrame.getPanel() == PanelCadastrarprofessor.getCadastrarprofessor()){
                Professor professor = new Professor();
                professor.setNome(Utilidades.getCampo1().getText());
                professor.setCpf(Utilidades.getCampo2().getText());
                professor.setRg(Utilidades.getCampo3().getText());
                professor.setDataNascimento(Utilidades.getCampo4().getText());
                professor.setMatricula(Utilidades.getCampo5().getText());
                professor.setTitulacao(Utilidades.getCampo6().getText());
                professor.setRegimeTrabalho(Utilidades.getCampo7().getText());
                professor.setArea(Utilidades.getCampo8().getText());
                try{
                    professor.setEndereco(Utilidades.getCampo9().getText(), 
                    Utilidades.getCampo10().getText(), 
                    Utilidades.getCampo11().getText(), 
                    Utilidades.getCampo12().getText(), 
                    Utilidades.getCampo13().getText(), 
                    Integer.parseInt(Utilidades.getCampo14().getText()));
                }
                catch(Exception ex){}
                Repositorio.SetProfessor(professor);
            }
            else if(ControladorFrame.getPanel() == TelaCadastroAluno.getTelaCadastroAluno()){
                Aluno aluno = new Aluno();
                aluno.setNome(Utilidades.getCampo1().getText());
                aluno.setCpf(Utilidades.getCampo2().getText());
                aluno.setRg(Utilidades.getCampo3().getText());
                aluno.setDataNascimento(Utilidades.getCampo4().getText());
                aluno.setMatricula(Utilidades.getCampo5().getText());
                aluno.setSexo(Utilidades.getCampo6().getText());
                aluno.setCurso(Utilidades.getCampo7().getText());
                try{
                    aluno.setEndereco(Utilidades.getCampo8().getText(), 
                    Utilidades.getCampo9().getText(), 
                    Utilidades.getCampo10().getText(), 
                    Utilidades.getCampo11().getText(), 
                    Utilidades.getCampo12().getText(), 
                    Integer.parseInt(Utilidades.getCampo13().getText()));
                }
                catch(Exception ex){}
                Repositorio.setAluno(aluno);
            }
            //
            else if(ControladorFrame.getPanel() == TelaCadastroClasse.getTelaCadastroClasse()){
                Classe classe = new Classe();
                ArrayList<Aluno> alunos = new ArrayList<Aluno>();
                int i = 0;
                if(e.getComponent() == Utilidades.getButtonPesquisar()){
                    alunos.add(Repositorio.getAluno(Utilidades.getCampo1().getText()));
                    Aluno alunoAux = alunos.get(i);
                    if(alunoAux == null){
                        alunos.remove(i);
                        i -= 1;
                    }
                    i++;
                }
                classe.setAlunos(alunos);
                classe.setProfessor(Repositorio.getProfessor(Utilidades.getCampo2().getText()));
                classe.setPeriodoLetivo(Repositorio.getPeriodoLetivo(Utilidades.getCampo4().getText()));
                classe.setDisciplina(Repositorio.getDisciplina(Utilidades.getCampo4().getText()));
                Repositorio.SetClasse(classe);
            }
            else if(ControladorFrame.getPanel() == TelaCadastroDisciplina.getTelaCadastroDisciplina()){
                Disciplina disciplina = new Disciplina();
                disciplina.setNome(Utilidades.getCampo1().getText());
                disciplina.setEmenta(Utilidades.getCampo2().getText());
                try{
                    disciplina.setCargaHoraria(Integer.parseInt(Utilidades.getCampo3().getText()));
                }
                catch(Exception ex){}
                Repositorio.setDisciplina(disciplina);
            }
            else if(ControladorFrame.getPanel() == TelaCadastroPerLet.criarPainel()){
                PeriodoLetivo per = new PeriodoLetivo();
                per.setNome(Utilidades.getCampo1().getText());
                try{
                    per.setDiasLetivos(Integer.parseInt(Utilidades.getCampo2().getText()));
                }
                catch(Exception ex){}
                per.setDataInicio((Utilidades.getCampo3().getText()));
                per.setDataFim((Utilidades.getCampo3().getText()));
                Repositorio.setPeriodoLetivo(per);
            }
        }
        else if(e.getComponent() == Utilidades.getButtonPesquisar()){
            if(ControladorFrame.getPanel() == TelaConsultaProfessor.getPainel()){
                Professor professor = new Professor();
                professor = Repositorio.getProfessor(Utilidades.getCampo1().getText());
                if (professor != null)
                    TelaConsultaProfessor.criarPainel(professor);
                else{
                    JOptionPane.showMessageDialog(null, "Professor não existe");
                }
            }
            if(ControladorFrame.getPanel() == TelaConsultaAluno.getPainel()){
                Aluno aluno = new Aluno();
                aluno = Repositorio.getAluno(Utilidades.getCampo1().getText());
                if (aluno != null)
                    TelaConsultaAluno.criarPainel(aluno);
                else
                    JOptionPane.showMessageDialog(null, "Aluno não existe");
            }
        }
        //System.out.println(Utilidades.getCampo1().getX());
        Frame.getFrame().setContentPane(TelaIni.criarTela());
        Utilidades.setTextField();
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
