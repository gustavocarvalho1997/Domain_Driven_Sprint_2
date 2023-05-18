package br.com.fiap.sprint.model;

public class Guincho extends Veiculo{
	//Atributos
	private String informacoesAdicionais;
	private double cargaMaximaEmToneladas;
	//Construtores
	public Guincho(String modelo, String chassi, String renavam, String cor, int ano, double altura, double comprimento,
			double largura, String informacoesAdicionais, double cargaMaximaEmToneladas) {
		super(modelo, chassi, renavam, cor, ano, altura, comprimento, largura);
		this.informacoesAdicionais = informacoesAdicionais;
		this.cargaMaximaEmToneladas = cargaMaximaEmToneladas;
	}
	public Guincho() {
		super();
	}
	//Getters
	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	public double getCargaMaximaEmToneladas() {
		return cargaMaximaEmToneladas;
	}
	//Setters
	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}
	public void setCargaMaximaEmToneladas(double cargaMaximaEmToneladas) {
		this.cargaMaximaEmToneladas = cargaMaximaEmToneladas;
	}
	//Métodos
	@Override
	public void emitiInformacoes() {
		super.emitiInformacoes();
		String propria = "Carga Máxima: " + cargaMaximaEmToneladas + " toneladas, Informações adicionais: " 
				+ informacoesAdicionais;
		System.out.println(propria);
	}//emitiInformacoes
}//CLASS