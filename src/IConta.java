
public interface IConta {

	void depositar(double quantidade);

	void sacar(double quantidade);

	void transferir(double quantidade, Conta conta);

}
