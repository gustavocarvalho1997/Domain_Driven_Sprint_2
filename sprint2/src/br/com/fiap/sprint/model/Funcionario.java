package br.com.fiap.sprint.model;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
	//Atributos
	private Cliente cliente;
	private String cargo, setor;
	//Construtores
	public Funcionario(String nome, String cpf, String id, String dataNascimento, String sexo, String email,
			Endereco endereco, Cliente cliente, String cargo, String setor) {
		super(nome, cpf, id, dataNascimento, sexo, email, endereco);
		this.cliente = cliente;
		this.cargo = cargo;
		this.setor = setor;
	}
	public Funcionario() {
		super();
	}
	//Getters
	public Cliente getCliente() {
		return cliente;
	}
	public String getCargo() {
		return cargo;
	}
	public String getSetor() {
		return setor;
	}
	//Setters
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	//Métodos
	public void enviaMensagem() {
		int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Selecione o destinatário: \n 1 - Cliente \n 2 - Prestador de serviço em campo "));
		String mensagem = JOptionPane.showInputDialog("Escreva aqui a sua mensagem: ");
		if(opcaoEscolhida == 1) {
			System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
			System.out.println("Funcionario: " + super.getNome());
			System.out.println("Email: " + super.getEmail());
			System.out.println("Destinatário: " + cliente.getNome());
			System.out.println("Mensagem Encaminhada:" + mensagem);
		} else if(opcaoEscolhida == 2) {
			System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
			System.out.println("Funcionario: " + super.getNome());
			System.out.println("Email: " + super.getEmail());
			System.out.println("Destinatário: Prestador de serviço");
			System.out.println("Mensagem Encaminhada:" + mensagem);
		} else {
			System.out.println("Opção inválida, favor encaminhar novamente, verificando o destinatário.");
		}
	}//enviaMensagem
	
	
}//CLASS
