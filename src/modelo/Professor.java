package modelo;

public class Professor {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String matricula;
	private String titulacao;
	private String regimeTrabalho;
	private String area;
	private Endereco endereco;
	
	public Professor(String nome, String cpf, String rg, String dataNascimento, String matricula, String titulacao,
			String regimeTrabalho, String area) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
		this.titulacao = titulacao;
		this.regimeTrabalho = regimeTrabalho;
		this.area = area;
	}

	public Professor() {
	}

	public void setEndereco(String logradouro, String cidade, String bairro, String estado, String complemento, int numero){
		endereco = new Endereco();
		endereco.setLogradouro(logradouro);
		endereco.setCidade(cidade);
		endereco.setBairro(bairro);
		endereco.setEstado(estado);
		endereco.setComplemento(estado);
		endereco.setNumero(numero);
	}

	public Endereco getEndereço(){
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getRegimeTrabalho() {
		return regimeTrabalho;
	}

	public void setRegimeTrabalho(String regimeTrabalho) {
		this.regimeTrabalho = regimeTrabalho;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
