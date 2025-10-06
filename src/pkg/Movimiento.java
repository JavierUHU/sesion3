package pkg;

public class Movimiento {
	Double importe;
	enum Signo{
		D, H
	}
	Signo signo;
	String detalle;
	public Movimiento(double i, Signo d) {
		importe = i;
		signo = d;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
