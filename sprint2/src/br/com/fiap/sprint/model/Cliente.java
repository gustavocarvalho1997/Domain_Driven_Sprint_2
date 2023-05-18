package br.com.fiap.sprint.model;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
	//Atributos
	private PlanoDeSeguro planoDeSeguro;
	private Chamado chamado;
	private Veiculo veiculo;
	private String senha;
	private boolean statusLogin;
	//Construtores
	public Cliente(String nome, String cpf, String id, String dataNascimento, String sexo, String email,
			Endereco endereco, PlanoDeSeguro planoDeSeguro, Chamado chamado, Veiculo veiculo, String senha) {
		super(nome, cpf, id, dataNascimento, sexo, email, endereco);
		this.planoDeSeguro = planoDeSeguro;
		this.chamado = chamado;
		this.veiculo = veiculo;
		this.senha = senha;
	}
	public Cliente() {
		super();
	}
	//Getters
	public PlanoDeSeguro getPlanoDeSeguro() {
		return planoDeSeguro;
	}
	public Chamado getChamado() {
		return chamado;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public String getSenha() {
		return senha;
	}
	public boolean isStatusLogin() {
		return statusLogin;
	}
	//Setters
	public void setPlanoDeSeguro(PlanoDeSeguro planoDeSeguro) {
		this.planoDeSeguro = planoDeSeguro;
	}
	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setStatusLogin(boolean statusLogin) {
		this.statusLogin = statusLogin;
	}
	//Métodos
	public void login() {
		String emailInformado = JOptionPane.showInputDialog("Favor, digite seu email de login: ");
		String senhaInformada = JOptionPane.showInputDialog("Favor, digite sua senha:" );
		if(emailInformado.equals(super.getEmail()) && senhaInformada.equals(senha)) {
			statusLogin = true;
			System.out.println("Login Efetuado com sucesso!");
		} else {
			System.out.println("Acesso negado!");
		}
	}//login
	public void adicionaDescricaoChamado() {
		if(statusLogin == true) {
			String descricaoInformada = JOptionPane.showInputDialog("Favor, descreva a ocorrencia: ");
			chamado.setDescricaoDaOcorrencia(descricaoInformada);
			System.out.println("Ocorrencia informada com sucesso");
			chamado.emitiInformacoes();
		} else {
			System.out.println("Necessário ter efetuado login");
		}
	}//adicionaDescricaoChamado
	public void alteraSituacaoChamado() {
		if(statusLogin == true) {
			int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Altere o status do seu chamado \n 1 - para ativar \n 2 - para pausar \n 3 - para fechar"));
			if(opcaoEscolhida == 1) {
				chamado.ativaChamado();
			} else if(opcaoEscolhida == 2) {
				chamado.pausaChamado();
			} else if(opcaoEscolhida == 3) {
				chamado.fechaChamado();
			} else {
				System.out.println("Opção inválida");
			}
		} else {
			System.out.println("Login necessário!");
		}
	}//alteraSituacaoChamado
	public void enviaMensagem() {
		if(statusLogin == true) {
			int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Selecione o destinatário: \n 1 - Funcionario da Porto \n 2 - Prestador de serviço em campo "));
			String mensagem = JOptionPane.showInputDialog("Escreva aqui a sua mensagem: ");
			if(opcaoEscolhida == 1) {
				System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
				System.out.println("Cliente: " + super.getNome());
				System.out.println("Email: " + super.getEmail());
				System.out.println("Destinatário: Funcionário da Porto");
				System.out.println("Mensagem Encaminhada:" + mensagem);
			} else if(opcaoEscolhida == 2) {
				System.out.println("Sua mensagem foi encaminhada com sucesso, verifique a seguir as informações referente a mensagem:");
				System.out.println("Cliente: " + super.getNome());
				System.out.println("Email: " + super.getEmail());
				System.out.println("Destinatário: Prestador de serviço");
				System.out.println("Mensagem Encaminhada:" + mensagem);
			} else {
				System.out.println("Opção inválida, favor encaminhar novamente, verificando o destinatário.");
			}
		} else {
			System.out.println("Login necessário");
		}
	}//enviaMensagem
	
}//class
