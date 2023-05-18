package br.com.fiap.sprint.view;

import br.com.fiap.sprint.model.Caminhao;
import br.com.fiap.sprint.model.Chamado;
import br.com.fiap.sprint.model.Cliente;
import br.com.fiap.sprint.model.Endereco;
import br.com.fiap.sprint.model.Funcionario;
import br.com.fiap.sprint.model.Guincho;
import br.com.fiap.sprint.model.PlanoDeSeguro;
import br.com.fiap.sprint.model.PrestadorDeServico;

public class Terminal {
	public static void main(String[] args) {
		PlanoDeSeguro plano = new PlanoDeSeguro(123456789, "Seguro veiculos pesados", "Manutenção, guincho, roubo", "16/07/2002");
		Caminhao caminhao1 = new Caminhao("Volvo FM", "9BRBLWHEXG0107721", "59487135-0", "Preto", 2016, 2.9, 6.7, 2.5, 3, 7.9);
		Endereco enderecoCliente = new Endereco("Rua Trevo", "Pq. Guarani", "São Paulo", "São Paulo", "12350-987", 124);
		Endereco enderecoOcorrencia = new Endereco("Av. Imperador", "Jardim das Camelias", "São Paulo", "São Paulo", "15765-528", 846);
		Chamado chamado1 = new Chamado(1238529, "15/02/2023", "17:56", enderecoOcorrencia);
		Cliente cliente = new Cliente("Ronald O Caminhoneiro", "157.158.965-00", "rm559863", "25/06/2001", "masculino", "email123@fiap.com.br", enderecoCliente, plano, chamado1, caminhao1, "senha123");
		Guincho guincho1 = new Guincho("Vw 11180", "9VWDWFEGAD0185591", "51687952-0", "Branco", 2012, 2.3, 6.2, 2.2, "Possivel acoplar ganchos", 9.7);
		Endereco enderecoFuncionario = new Endereco("Rua candida de carvalho", "Camélias", "São Paulo", "São Paulo", "08480-460", 552);
		Funcionario funcionario = new Funcionario("Vitor", "251821512-22", "rm875623", "24/12/2000", "masculino", "email456@fiap.com.br", enderecoFuncionario, cliente, "Atendente", "Suporte");
		Endereco enderecoPrestador = new Endereco("Rua Arraial de São Bartolomeu", "Vila Carmosina", "São Paulo", "São Paulo", "08290-190", 325);
		PrestadorDeServico prestador1 = new PrestadorDeServico("Nicoly", "487489654-22", "rm845963", "30/11/2001", "feminino", "email789@fiap.com.br", enderecoPrestador, chamado1, "09:00", "23:00", guincho1);
		
		
		//login: email123@fiap.com.br senha: senha123
		cliente.login();
		cliente.adicionaDescricaoChamado();
		cliente.alteraSituacaoChamado();
		cliente.enviaMensagem();
		cliente.getChamado().emitiInformacoes();
		cliente.getVeiculo().emitiInformacoes();
		
		funcionario.emitiInformacoes();
		funcionario.enviaMensagem();
		
		prestador1.emitiInformacoes();
		prestador1.enviaMensagem();
		
		
	}//MAIN
}//CLASS
