package entity;

/**
 * @author Mikaelbr073
 *
 */
public class ContaComum extends Conta {

	public ContaComum(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	public void rende() {
		setSaldo(this.saldo*1.1);
	}
	
	
}
