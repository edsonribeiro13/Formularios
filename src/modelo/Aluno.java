package modelo;

public class Aluno {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String matricula;
	private String sexo;
	private String curso;
	private Endereco endereco;
	private static Aluno aluno;
	
	public Aluno(String nome, String cpf, String rg, String dataNascimento, String matricula, String endereco,
			String sexo, String curso) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
		this.sexo = sexo;
		this.curso = curso;
	}

	public Aluno(){

	}

	public static void setAluno(Aluno A){
		aluno = A;
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

	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
