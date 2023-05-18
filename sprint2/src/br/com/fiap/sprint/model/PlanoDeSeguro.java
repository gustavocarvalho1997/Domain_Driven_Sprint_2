package br.com.fiap.sprint.model;

public class PlanoDeSeguro {
	//Atributos
	private int codigoDoSeguro;
	private String tipoDeSeguro, coberturas, dataDaContratacao;
	//Construtores
	public PlanoDeSeguro(int codigoDoSeguro, String tipoDeSeguro, String coberturas, String dataDaContratacao) {
		super();
		this.codigoDoSeguro = codigoDoSeguro;
		this.tipoDeSeguro = tipoDeSeguro;
		this.coberturas = coberturas;
		this.dataDaContratacao = dataDaContratacao;
	}
	public PlanoDeSeguro() {
		super();
	}
	//Getters
	public int getCodigoDoSeguro() {
		return codigoDoSeguro;
	}
	public String getTipoDeSeguro() {
		return tipoDeSeguro;
	}
	public String getCoberturas() {
		return coberturas;
	}
	public String getDataDaContratacao() {
		return dataDaContratacao;
	}
	//Setters
	public void setCodigoDoSeguro(int codigoDoSeguro) {
		this.codigoDoSeguro = codigoDoSeguro;
	}
	public void setTipoDeSeguro(String tipoDeSeguro) {
		this.tipoDeSeguro = tipoDeSeguro;
	}
	public void setCoberturas(String coberturas) {
		this.coberturas = coberturas;
	}
	public void setDataDaContratacao(String dataDaContratacao) {
		this.dataDaContratacao = dataDaContratacao;
	}
	//Métodos
	public void emitiInformacoes() {
		String texto = "Código do seguro: " + codigoDoSeguro + ", tipo: " 
				+ tipoDeSeguro + ", coberturas: " + coberturas + ", data da contratação: "
				+ dataDaContratacao;
		System.out.println(texto);
	}//emitiInformacoes
	
	
}//CLASS