package pkg;

public class Cuenta {

	
	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double i) {
		saldo = i;
	}


	public Double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void retirar(double i) {
		saldo = -200.0;
		
	}

	public void ingresar(double i) {
		saldo = 200.0;
		
	}
	
}
