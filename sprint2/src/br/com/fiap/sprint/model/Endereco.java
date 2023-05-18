package br.com.fiap.sprint.model;

public class Endereco {
	//Atributos
	private String logradouro, bairro, cidade, estado, cep;
	private int numero;
	//Construtores
	public Endereco(String logradouro, String bairro, String cidade, String estado, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}
	public Endereco() {
		super();
	}
	//Getters
	public String getLogradouro() {
		return logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public int getNumero() {
		return numero;
	}
	//Setters
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//Métodos
	public void emitiInformacoes() {
		String texto = "Logradouro: " + logradouro + ", número: " + numero 
				+ ", bairro: " + bairro + ", cidade: " + cidade + ", estado: "
				+ estado + ", cep: " + cep;
		System.out.println(texto);
	}//emitiInformacoes
}//CLASS
