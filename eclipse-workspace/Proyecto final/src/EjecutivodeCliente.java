
public class EjecutivodeCliente {
private String Nombre;
private int Rut;
private int Edad;
private String AņosAcargo;
private int CantidadCliente;
public EjecutivodeCliente(String nombre, int rut, int edad, String aņosAcargo, int cantidadCliente) {
	super();
	Nombre = nombre;
	Rut = rut;
	Edad = edad;
	AņosAcargo = aņosAcargo;
	CantidadCliente = cantidadCliente;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getRut() {
	return Rut;
}
public void setRut(int rut) {
	Rut = rut;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
public String getAņosAcargo() {
	return AņosAcargo;
}
public void setAņosAcargo(String aņosAcargo) {
	AņosAcargo = aņosAcargo;
}
public int getCantidadCliente() {
	return CantidadCliente;
}
public void setCantidadCliente(int cantidadCliente) {
	CantidadCliente = cantidadCliente;
}
@Override
public String toString() {
	return "EjecutivodeCliente [Nombre=" + Nombre + ", Rut=" + Rut + ", Edad=" + Edad + ", AņosAcargo=" + AņosAcargo
			+ ", CantidadCliente=" + CantidadCliente + "]";
}

}
