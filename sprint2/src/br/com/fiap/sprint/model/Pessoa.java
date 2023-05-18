package br.com.fiap.sprint.model;

public class Pessoa {
	//Atributos
	private String nome, cpf, id, dataNascimento, sexo, email;
	private Endereco endereco;
	//Construtores
	public Pessoa(String nome, String cpf, String id, String dataNascimento, String sexo, String email,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = endereco;
	}
	public Pessoa() {
		super();
	}
	//Getters
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getId() {
		return id;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getEmail() {
		return email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	//Métodos
	public void emitiInformacoes() {
		String conj1 = "Nome: " + nome + ", CPF: " + cpf + ", ID: " + id;
		String conj2 = "Data de Nascimento: " + dataNascimento + ", sexo: " + sexo;
		String conj3 = "Email: " + email;
		System.out.println(conj1 + "\n" + conj2 + "\n" + conj3);
		endereco.emitiInformacoes();
	}//emitiInformacoes
}//CLASS