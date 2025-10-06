package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Signo;

public class Cuenta {

	
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> mMovimientos = new ArrayList<Movimiento>();
	
	public Cuenta(double i) {
		saldo = i;
	}


	public Cuenta(String string) {
		numero = string;
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
		Movimiento m = new Movimiento(i, Signo.D);
		if(saldo - i >= -500) {
			saldo -= i;
			m.setDetalle("Test");
		}
		else {
			m.setDetalle("Fondos insuficientes (saldo " + saldo + ") en la cuenta" + numero + "para el reintegro de " + i);
			
		}
		mMovimientos.add(m);
	}

	public void ingresar(double i) {
		saldo += i;
		Movimiento m = new Movimiento(i, Signo.H);
		m.setDetalle("Test");
		mMovimientos.add(m);
	}
	
}
