package repositorio;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Classe;
import modelo.Disciplina;
import modelo.PeriodoLetivo;
import modelo.Professor;

public class Repositorio{

    private static ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();
    private static ArrayList<Classe> arrayClasse = new ArrayList<Classe>();
    private static ArrayList<Professor> arrayProfessores = new ArrayList<Professor>();
    private static ArrayList<Disciplina> arrayDisciplina = new ArrayList<Disciplina>();
    private static ArrayList<PeriodoLetivo> arrayPeriodoLetivo = new ArrayList<PeriodoLetivo>();

    public static void setAluno(Aluno A){
		arrayAlunos.add(A);
	}

    public static Aluno getAluno(String nome){
		for(Aluno i : arrayAlunos){
			if (i.getNome().contains(nome)){
				return i;
			}
		}
		return null;
	}

	public static void SetClasse(Classe C){
		arrayClasse.add(C);
	}

	/*public static Classe getClasse(String nome){
		for(Classe i : arrayClasse){
			if (i.getNome() == nome)
				return i;
		}
		return null;
	}*/

    public static void SetProfessor(Professor p){
		arrayProfessores.add(p);
	}

	public static Professor getProfessor(String nome){
		for(Professor i : arrayProfessores){
			if (i.getNome().contains(nome))
				return i;
		}
		return null;
	}

    public static void setDisciplina(Disciplina D){
		arrayDisciplina.add(D);
	}

    public static Disciplina getDisciplina(String nome){
		for(Disciplina i : arrayDisciplina)
			if (i.getNome() == nome)
				return i;
		return null;
	}

	public static void setPeriodoLetivo(PeriodoLetivo P){
		arrayPeriodoLetivo.add(P);
	}

    public static PeriodoLetivo getPeriodoLetivo(String nome){
		for(PeriodoLetivo i : arrayPeriodoLetivo)
			if (i.getNome() == nome)
				return i;
		return null;
	}
}
