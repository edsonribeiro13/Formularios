package visao;

import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Aluno;

public class TelaConsultaAluno extends JPanel{

    private static TelaConsultaAluno painel;
    private static ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();

    public static TelaConsultaAluno consultaAluno(){

        painel.setVisible(true);
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());

        painel.add(Labels.getTitulo("Consultar alunos"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
        painel.add(Utilidades.getButtonPesquisar(Utilidades.getCampo1().getX() + 50, Labels.getLabelY() + 100));

		Labels.setLabelNull();

        return painel;

    }

    public static TelaConsultaAluno criarPainel(Aluno aluno) {

		painel.setVisible(true);
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());
		
		painel.add(Labels.getTitulo("Consulta de professores"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Labels.getNomeLabel(aluno.getNome()));
		painel.add(Labels.getNomeLabel("CPF"));
		painel.add(Labels.getNomeLabel(aluno.getCpf()));
		painel.add(Labels.getNomeLabel("RG"));
		painel.add(Labels.getNomeLabel(aluno.getRg()));
		painel.add(Labels.getNomeLabel("Data de Nascimento"));
		painel.add(Labels.getNomeLabel(aluno.getDataNascimento()));
		painel.add(Labels.getNomeLabel("Matricula"));
		painel.add(Labels.getNomeLabel(aluno.getMatricula()));
		painel.add(Labels.getNomeLabel("Sexo"));
		painel.add(Labels.getNomeLabel(aluno.getSexo()));
		painel.add(Labels.getNomeLabel("Regime de Trabalho"));
		painel.add(Labels.getNomeLabel(aluno.getCurso()));
		painel.add(Labels.getNomeLabel("logradouro"));
		painel.add(Labels.getNomeLabel(aluno.getEndereço().getLogradouro()));
		painel.add(Labels.getNomeLabel("cidade"));
		painel.add(Labels.getNomeLabel(aluno.getEndereço().getCidade()));
		painel.add(Labels.getNomeLabel("bairro"));
		painel.add(Labels.getNomeLabel(aluno.getEndereço().getBairro()));
		painel.add(Labels.getNomeLabel("estado"));
		painel.add(Labels.getNomeLabel(aluno.getEndereço().getEstado()));
		painel.add(Labels.getNomeLabel("complemento"));
		painel.add(Labels.getNomeLabel(aluno.getEndereço().getComplemento()));
		painel.add(Labels.getNomeLabel("numero"));
		painel.add(Labels.getNomeLabel(Integer.toString(aluno.getEndereço().getNumero())));

		Labels.setLabelNull();

		return painel;
		
	}

    public static TelaConsultaAluno getPainel() {
        if (painel == null){
            painel = new TelaConsultaAluno();
        }
        painel = TelaConsultaAluno.consultaAluno();
        return painel;
    }

    public static ArrayList<Aluno> getArrayAlunos() {
        return arrayAlunos;
    }

    public static void setArrayAlunos(ArrayList<Aluno> arrayAlunos) {
        TelaConsultaAluno.arrayAlunos = arrayAlunos;
    }

    
}
