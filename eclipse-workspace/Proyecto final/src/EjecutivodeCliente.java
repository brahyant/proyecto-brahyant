
public class EjecutivodeCliente {
private String Nombre;
private int Rut;
private int Edad;
private String A�osAcargo;
private int CantidadCliente;
public EjecutivodeCliente(String nombre, int rut, int edad, String a�osAcargo, int cantidadCliente) {
	super();
	Nombre = nombre;
	Rut = rut;
	Edad = edad;
	A�osAcargo = a�osAcargo;
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
public String getA�osAcargo() {
	return A�osAcargo;
}
public void setA�osAcargo(String a�osAcargo) {
	A�osAcargo = a�osAcargo;
}
public int getCantidadCliente() {
	return CantidadCliente;
}
public void setCantidadCliente(int cantidadCliente) {
	CantidadCliente = cantidadCliente;
}
@Override
public String toString() {
	return "EjecutivodeCliente [Nombre=" + Nombre + ", Rut=" + Rut + ", Edad=" + Edad + ", A�osAcargo=" + A�osAcargo
			+ ", CantidadCliente=" + CantidadCliente + "]";
}

}
