
public class EjecutivodeCliente {
private String Nombre;
private int Rut;
private int Edad;
private String AñosAcargo;
private int CantidadCliente;
public EjecutivodeCliente(String nombre, int rut, int edad, String añosAcargo, int cantidadCliente) {
	super();
	Nombre = nombre;
	Rut = rut;
	Edad = edad;
	AñosAcargo = añosAcargo;
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
public String getAñosAcargo() {
	return AñosAcargo;
}
public void setAñosAcargo(String añosAcargo) {
	AñosAcargo = añosAcargo;
}
public int getCantidadCliente() {
	return CantidadCliente;
}
public void setCantidadCliente(int cantidadCliente) {
	CantidadCliente = cantidadCliente;
}
@Override
public String toString() {
	return "EjecutivodeCliente [Nombre=" + Nombre + ", Rut=" + Rut + ", Edad=" + Edad + ", AñosAcargo=" + AñosAcargo
			+ ", CantidadCliente=" + CantidadCliente + "]";
}

}
