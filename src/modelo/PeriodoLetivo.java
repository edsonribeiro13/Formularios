package modelo;

public class PeriodoLetivo {

	private String nome;
	private int diasLetivos;
	private String dataInicio;
	private String dataFim;
	
	public PeriodoLetivo(String nome, int diasLetivos, String dataInicio, String dataFim) {
		this.nome = nome;
		this.diasLetivos = diasLetivos;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public PeriodoLetivo(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiasLetivos() {
		return diasLetivos;
	}

	public void setDiasLetivos(int diasLetivos) {
		this.diasLetivos = diasLetivos;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	
	
	
}
