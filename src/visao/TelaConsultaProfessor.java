package visao;

import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Professor;

public class TelaConsultaProfessor extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TelaConsultaProfessor painel;
    private static ArrayList<Professor> arrayProfessores = new ArrayList<Professor>();

    public static TelaConsultaProfessor consultaProfessor(){

        painel.setVisible(true);
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());

        painel.add(Labels.getTitulo("Consultar professores"));
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Utilidades.getCampo1(Labels.getLabelX() + 200, Labels.getLabelY()));
		painel.add(Utilidades.getButtonPesquisar(Utilidades.getCampo1().getX() + 50, Labels.getLabelY() + 100));

		Labels.setLabelNull();

        return painel;

    }

    public static TelaConsultaProfessor criarPainel(Professor p) {

		painel.setVisible(true);
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());
		
		painel.add(Labels.getNomeLabel("Nome"));
		painel.add(Labels.getNomeLabel(p.getNome()));
		painel.add(Labels.getNomeLabel("CPF"));
		painel.add(Labels.getNomeLabel(p.getCpf()));
		painel.add(Labels.getNomeLabel("RG"));
		painel.add(Labels.getNomeLabel(p.getRg()));
		painel.add(Labels.getNomeLabel("Data de Nascimento"));
		painel.add(Labels.getNomeLabel(p.getDataNascimento()));
		painel.add(Labels.getNomeLabel("Matricula"));
		painel.add(Labels.getNomeLabel(p.getMatricula()));
		painel.add(Labels.getNomeLabel("Titulacao"));
		painel.add(Labels.getNomeLabel(p.getTitulacao()));
		painel.add(Labels.getNomeLabel("Regime de Trabalho"));
		painel.add(Labels.getNomeLabel(p.getRegimeTrabalho()));
		painel.add(Labels.getNomeLabel("Área"));
		painel.add(Labels.getNomeLabel(p.getArea()));
		try{
			painel.add(Labels.getNomeLabel("logradouro"));
			painel.add(Labels.getNomeLabel(p.getEndereço().getLogradouro()));
			painel.add(Labels.getNomeLabel("cidade"));
			painel.add(Labels.getNomeLabel(p.getEndereço().getCidade()));
			painel.add(Labels.getNomeLabel("bairro"));
			painel.add(Labels.getNomeLabel(p.getEndereço().getBairro()));
			painel.add(Labels.getNomeLabel("estado"));
			painel.add(Labels.getNomeLabel(p.getEndereço().getEstado()));
			painel.add(Labels.getNomeLabel("complemento"));
			painel.add(Labels.getNomeLabel(p.getEndereço().getComplemento()));
			painel.add(Labels.getNomeLabel("numero"));
			painel.add(Labels.getNomeLabel(Integer.toString(p.getEndereço().getNumero())));
		}
		catch(Exception ex){}

		Labels.setLabelNull();

		return painel;
		
	}

    public static TelaConsultaProfessor getPainel() {
        if (painel == null){
            painel = new TelaConsultaProfessor();
        }
        painel = TelaConsultaProfessor.consultaProfessor();
        return painel;
    }

    public static ArrayList<Professor> getArrayProfessores() {
        return arrayProfessores;
    }

    public static void setArrayProfessores(ArrayList<Professor> arrayProfessores) {
        TelaConsultaProfessor.arrayProfessores = arrayProfessores;
    }

}