package entity;

/**
 * @author Mikaelbr073
 *
 */
public class Conta {

	protected double saldo;

	public Conta(double valor) {
		this.saldo = valor;
	}

	public void deposito(double valor) throws ValorIvalidoException{
		if (valor <= 0) {
			throw new ValorIvalidoException();
		}
		this.saldo = valor + this.saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	
	}
}
