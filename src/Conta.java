

public class Conta {
	private double saldo;
	int conta;
	int agencia;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor <= saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso!");
			return true;
		} else {
			System.out.println("Transferencia não realizada.");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}