import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void imprimirClientes() {
		System.out.printf("Clientes %s:\n", this.nome);
		List<Cliente> clientes = new ArrayList<Cliente>();
		for(Conta conta:this.contas) {
			if(!clientes.contains(conta.getCliente())) {
				clientes.add(conta.getCliente());
				conta.getCliente().imprimirDados();
				System.out.println();
			}
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

}
