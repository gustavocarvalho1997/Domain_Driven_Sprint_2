package br.com.fiap.sprint.model;

import javax.swing.JOptionPane;

public class PrestadorDeServico extends Pessoa{
	//Atributos
	private Chamado chamado;
	private String horarioAbertura, horarioFechamento;
	private Veiculo veiculo;
	//Construtores
	public PrestadorDeServico(String nome, String cpf, String id, String dataNascimento, String sexo, String email,
			Endereco endereco, Chamado chamado, String horarioAbertura, String horarioFechamento, Veiculo veiculo) {
		super(nome, cpf, id, dataNascimento, sexo, email, endereco);
		this.chamado = chamado;
		this.horarioAbertura = horarioAbertura;
		this.horarioFechamento = horarioFechamento;
		this.veiculo = veiculo;
	}
	public PrestadorDeServico() {
		super();
	}
	//Getters
	public Chamado getChamado() {
		return chamado;
	}
	public String getHorarioAbertura() {
		return horarioAbertura;
	}
	public String getHorarioFechamento() {
		return horarioFechamento;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	//Setters
	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	public void setHorarioAbertura(String horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}
	public void setHorarioFechamento(String horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	//Métodos
	public void enviaMensagem() {
		int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Selecione o destinatário: \n 1 - Cliente \n 2 - Funcionario"));
		String mensagem = JOptionPane.showInputDialog("Escreva aqui a sua mensagem: ");
		if(opcaoEscolhida == 1) {
			System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
			System.out.println("Prestador de serviço: " + super.getNome());
			System.out.println("Email: " + super.getEmail());
			System.out.println("Destinatário: Cliente");
			System.out.println("Mensagem Encaminhada:" + mensagem);
		} else if(opcaoEscolhida == 2) {
			System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
			System.out.println("Prestador de serviço: " + super.getNome());
			System.out.println("Email: " + super.getEmail());
			System.out.println("Destinatário: Funcionario");
			System.out.println("Mensagem Encaminhada:" + mensagem);
		} else {
			System.out.println("Opção inválida, favor encaminhar novamente, verificando o destinatário.");
		}
	}//enviaMensagem
	
	
}//CLASS
