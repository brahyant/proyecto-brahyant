
public class CuentaBancaria {
private int NumeroCuenta;
private int saldo;
private int FechaApertura;
private String Estado;
public CuentaBancaria(int numeroCuenta, int saldo, int fechaApertura, String estado) {
	super();
	NumeroCuenta = numeroCuenta;
	this.saldo = saldo;
	FechaApertura = fechaApertura;
	Estado = estado;
}
public int getNumeroCuenta() {
	return NumeroCuenta;
}
public void setNumeroCuenta(int numeroCuenta) {
	NumeroCuenta = numeroCuenta;
}
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}
public int getFechaApertura() {
	return FechaApertura;
}
public void setFechaApertura(int fechaApertura) {
	FechaApertura = fechaApertura;
}
public String getEstado() {
	return Estado;
}
public void setEstado(String estado) {
	Estado = estado;
}
@Override
public String toString() {
	return "CuentaBancaria [NumeroCuenta=" + NumeroCuenta + ", saldo=" + saldo + ", FechaApertura=" + FechaApertura
			+ ", Estado=" + Estado + "]";
}


}
