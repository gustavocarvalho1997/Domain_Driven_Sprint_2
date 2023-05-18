package br.com.fiap.sprint.model;

public class Caminhao extends Veiculo{
	//Atributos
	private int numeroDeEixos;
	private double pesoTotalBrutoEmToneladas;
	//Construtores
	public Caminhao(String modelo, String chassi, String renavam, String cor, int ano, double altura,
			double comprimento, double largura, int numeroDeEixos, double pesoTotalBrutoEmToneladas) {
		super(modelo, chassi, renavam, cor, ano, altura, comprimento, largura);
		this.numeroDeEixos = numeroDeEixos;
		this.pesoTotalBrutoEmToneladas = pesoTotalBrutoEmToneladas;
	}
	public Caminhao() {
		super();
	}
	//Getters
	public int getNumeroDeEixos() {
		return numeroDeEixos;
	}
	public double getPesoTotalBrutoEmToneladas() {
		return pesoTotalBrutoEmToneladas;
	}
	//Setters
	public void setNumeroDeEixos(int numeroDeEixos) {
		this.numeroDeEixos = numeroDeEixos;
	}
	public void setPesoTotalBrutoEmToneladas(double pesoTotalBrutoEmToneladas) {
		this.pesoTotalBrutoEmToneladas = pesoTotalBrutoEmToneladas;
	}
	//Métodos
	@Override
	public void emitiInformacoes() {
		super.emitiInformacoes();
		String proprias = "Número de eixos: " + numeroDeEixos + ", Peso total bruto: "
				+ pesoTotalBrutoEmToneladas + " toneladas.";
		System.out.println(proprias);
	}//emitiInformacoes
}//CLASS
