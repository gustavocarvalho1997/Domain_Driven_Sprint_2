package br.com.fiap.sprint.model;

public class Chamado {
	//Atributos
	private int idChamado;
	private String dataDaOcorrencia, horaDaOcorrencia, descricaoDaOcorrencia;
	private Endereco enderecoDaOcorrencia;
	private boolean chamadoAtivo, chamadoPausado, chamadoFechado;
	//Construtores
	public Chamado(int idChamado, String dataDaOcorrencia, String horaDaOcorrencia, Endereco enderecoDaOcorrencia) {
		super();
		this.idChamado = idChamado;
		this.dataDaOcorrencia = dataDaOcorrencia;
		this.horaDaOcorrencia = horaDaOcorrencia;
		this.enderecoDaOcorrencia = enderecoDaOcorrencia;
	}
	public Chamado() {
		super();
	}
	//Getters
	public int getIdChamado() {
		return idChamado;
	}
	public String getDataDaOcorrencia() {
		return dataDaOcorrencia;
	}
	public String getHoraDaOcorrencia() {
		return horaDaOcorrencia;
	}
	public String getDescricaoDaOcorrencia() {
		return descricaoDaOcorrencia;
	}
	public Endereco getEnderecoDaOcorrencia() {
		return enderecoDaOcorrencia;
	}
	public boolean isChamadoAtivo() {
		return chamadoAtivo;
	}
	public boolean isChamadoPausado() {
		return chamadoPausado;
	}
	public boolean isChamadoFechado() {
		return chamadoFechado;
	}
	//Setters
	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}
	public void setDataDaOcorrencia(String dataDaOcorrencia) {
		this.dataDaOcorrencia = dataDaOcorrencia;
	}
	public void setHoraDaOcorrencia(String horaDaOcorrencia) {
		this.horaDaOcorrencia = horaDaOcorrencia;
	}
	public void setDescricaoDaOcorrencia(String descricaoDaOcorrencia) {
		this.descricaoDaOcorrencia = descricaoDaOcorrencia;
	}
	public void setEnderecoDaOcorrencia(Endereco enderecoDaOcorrencia) {
		this.enderecoDaOcorrencia = enderecoDaOcorrencia;
	}
	public void setChamadoAtivo(boolean chamadoAtivo) {
		this.chamadoAtivo = chamadoAtivo;
	}
	public void setChamadoPausado(boolean chamadoPausado) {
		this.chamadoPausado = chamadoPausado;
	}
	public void setChamadoFechado(boolean chamadoFechado) {
		this.chamadoFechado = chamadoFechado;
	}
	//Métodos
	public void emitiInformacoes() {
		String infoBasica = "ID do chamado: " + idChamado + ", data da ocorrencia: " + dataDaOcorrencia 
				+ ", hora da ocorrencia: " + horaDaOcorrencia + ", descrição: " + descricaoDaOcorrencia;
		System.out.println(infoBasica);
		enderecoDaOcorrencia.emitiInformacoes();
		if(chamadoAtivo == true) {
			System.out.println("Chamado Ativo");
		} else if(chamadoPausado == true) {
			System.out.println("Chamado Pausado");
		} else if(chamadoFechado == true) {
			System.out.println("Chamado Fechado");
		} else {
			System.out.println("Chamado não inicializado");
		}
	}//emitiInformacoes
	public void ativaChamado() {
		chamadoAtivo = true;
		chamadoFechado = false;
		chamadoPausado = false;
		System.out.println("Chamado ativo com sucesso!");
	}//ativaChamado
	public void fechaChamado() {
		chamadoAtivo = false;
		chamadoFechado = true;
		chamadoPausado = false;
		System.out.println("Chamado fechado com sucesso!");
	}//fechaChamado
	public void pausaChamado() {
		chamadoAtivo = false;
		chamadoFechado = false;
		chamadoPausado = true;
		System.out.println("Chamado Pausado com sucesso!");
	}//pausaChamado
}//CLASS
