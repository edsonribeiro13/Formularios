package modelo;

public class Classe {

	private Aluno[] alunos ;
	private Professor professor;
	private PeriodoLetivo periodoLetivo;
	private Disciplina disciplina;
	
	public Classe(Aluno[] alunos, Professor professor, PeriodoLetivo periodoLetivo, Disciplina disciplina) {
		this.alunos = alunos;
		this.professor = professor;
		this.periodoLetivo = periodoLetivo;
		this.disciplina = disciplina;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public PeriodoLetivo getPeriodoLetivo() {
		return periodoLetivo;
	}

	public void setPeriodoLetivo(PeriodoLetivo periodoLetivo) {
		this.periodoLetivo = periodoLetivo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}
