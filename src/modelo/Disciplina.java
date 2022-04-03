package modelo;

public class Disciplina {

	private String nome;
	private String ementa;
	private int cargaHoraria;
	
	
	public Disciplina(String nome, String ementa, int cargaHoraria) {
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}
