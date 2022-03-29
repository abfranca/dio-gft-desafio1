
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}
	
	public void render() {
		this.saldo *= 1.03;
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		System.out.println();
		super.imprimirExtrato();
	}

}
