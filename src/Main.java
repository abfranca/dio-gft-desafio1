
public class Main {

	public static void main(String[] args) {
		
		Banco bb = new Banco("Top Bank");
		Cliente cl = new Cliente("Paulo Silva", "12345678900");
		Conta cc = new ContaCorrente(cl, bb);
		Conta cp = new ContaPoupanca(cl, bb);
		Conta cn = new ContaPoupanca(new Cliente("Claudia Café", "11144477799"), bb);
		
		bb.imprimirClientes();
		
		cc.depositar(800);
		cc.transferir(200, cn);
		((ContaCorrente) cc).debitar();
		((ContaPoupanca) cn).render();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cn.imprimirExtrato();

	}

}
