package br.com.fiap.sprint.model;

public class Veiculo {
	//Atributos
	private String modelo, chassi, renavam, cor;
	private int ano;
	private double altura, comprimento, largura;
	//Construtores
	public Veiculo(String modelo, String chassi, String renavam, String cor, int ano, double altura, double comprimento,
			double largura) {
		super();
		this.modelo = modelo;
		this.chassi = chassi;
		this.renavam = renavam;
		this.cor = cor;
		this.ano = ano;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
	}
	public Veiculo() {
		super();
	}
	//Getters
	public String getModelo() {
		return modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public String getRenavam() {
		return renavam;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public double getAltura() {
		return altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getLargura() {
		return largura;
	}
	//Setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	//Métodos
	public void emitiInformacoes() {
		String conj1 = "Modelo: " + modelo + ", Chassi: " + chassi + ", Ano: "
				+ ano + ", Renavam: " + renavam + ", Cor: " + cor;
		String conj2 = "Altura: " + altura + ", Comprimento: " + comprimento 
				+ ", largura: " + largura;
		System.out.println(conj1 + "\n" + conj2);
	}//emitiInformacoes
}//CLASS
