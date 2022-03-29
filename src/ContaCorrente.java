
public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}
	
	public void debitar() {
		this.saldo *= 0.985;
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println();
		super.imprimirExtrato();
	}

}
