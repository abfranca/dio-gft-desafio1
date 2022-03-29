
public abstract class Conta implements IConta{
	
	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		banco.addConta(this);
	}
	
	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void sacar(double quantidade) {
		this.saldo -= quantidade;
	}
	
	public void transferir(double quantidade, Conta conta) {
		this.saldo -= quantidade;
		conta.depositar(quantidade);
	}
	
	public void imprimirExtrato() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println();
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

}
